package com.shop.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/oauth2/authorization/naver")
    public String naverButton() {
        return "Naver Request";
    }

    @GetMapping("/oauth2/authorization/kakao")
    public String kakaoButton() {
        return "Kakao Request";
    }

    @GetMapping("/oauth2/authorization/google")
    public String googleButton() {
        return "Google Request";
    }
}
