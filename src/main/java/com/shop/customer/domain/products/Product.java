package com.shop.customer.domain.products;

import com.shop.customer.domain.Category;
import com.shop.customer.domain.eums.ProductStatus;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

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

}
