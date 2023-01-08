package com.shop.customer.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Getter
@Embeddable
public class Address {
    private String city;
    private String street;
    private String zipcode;


    protected Address(){
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
