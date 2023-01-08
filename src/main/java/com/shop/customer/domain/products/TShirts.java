package com.shop.customer.domain.products;

import com.shop.customer.domain.eums.TSize;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
public class TShirts extends Product{

    @Enumerated(EnumType.STRING)
    private TSize tSize;
}
