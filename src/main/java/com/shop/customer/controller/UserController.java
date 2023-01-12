package com.shop.customer.controller;

import com.shop.customer.domain.Users;
import com.shop.customer.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/login")
    public Long login(@RequestBody Map<String, String> loginForm) {
        Users user = repository.findByEmailAndPassword(loginForm.get("email"), loginForm.get("password"));

        if(user!=null) {
            return user.getId();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

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
