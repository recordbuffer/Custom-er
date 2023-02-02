package com.shop.customer.domain;

import com.shop.customer.domain.products.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class OrderProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product productId;

    @ManyToOne
    private Orders orderId;
}
