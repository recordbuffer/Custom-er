package com.shop.customer;

import com.shop.customer.domain.Address;
import com.shop.customer.domain.Orders;
import com.shop.customer.domain.eums.DeliveryStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status = DeliveryStatus.READY;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Orders order;

}
