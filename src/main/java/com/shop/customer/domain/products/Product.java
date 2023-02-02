package com.shop.customer.domain.products;

import com.shop.customer.domain.Category;
import com.shop.customer.domain.OrderProducts;
import com.shop.customer.domain.eums.ProductStatus;
import com.shop.customer.exception.NotEnoughStockException;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "productType")
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    private int stockNum;
    private String description;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    @ManyToOne
    private Category category;

    @CreationTimestamp
    private Timestamp regDateTime;

    @UpdateTimestamp
    private Timestamp updatedDateTime;

    @OneToMany(mappedBy = "productId")
    private List<OrderProducts> productsList = new ArrayList<>();

    @OneToMany(mappedBy = "productId")
    private List<ProductImg> imgList = new ArrayList<>();

    public void addStock(int quantity) {
        this.stockNum += quantity;
    }

    public void removeStock(int quantity) {
        int restStock = this.stockNum - quantity;
        if (restStock<0) {
            throw new NotEnoughStockException("no more stock");
        }
        this.stockNum = restStock;
    }
}
