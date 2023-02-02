package com.shop.customer.domain.products;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ProductImg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imgId;

    private String imgName;
    private String oriImgName;
    private String url;
    private boolean repImgYn;

    @ManyToOne
    private Product productId;

    public void updateImg(String imgName, String oriImgName, String url, boolean repImgYn) {
        this.imgName = imgName;
        this.oriImgName = oriImgName;
        this.url = url;
        this.repImgYn = repImgYn;
    }
}
