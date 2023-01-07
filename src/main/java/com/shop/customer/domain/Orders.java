package com.shop.customer.domain;

import com.shop.customer.domain.eums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrderStatus status = OrderStatus.ORDER;

    @OneToMany(mappedBy = "order")
    private List<OrderProducts> productsList = new ArrayList<>();
}
