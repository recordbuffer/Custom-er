package com.shop.customer.controller;

import com.shop.customer.service.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


}
