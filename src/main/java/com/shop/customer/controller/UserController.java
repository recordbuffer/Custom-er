package com.shop.customer.controller;

import com.shop.customer.config.dto.JwtToken;
import com.shop.customer.config.dto.SessionUser;
import com.shop.customer.domain.Users;
import com.shop.customer.domain.dtos.SignupForm;
import com.shop.customer.service.UserService;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public JwtToken loginSuccess(@RequestBody Map<String, String> loginForm) {
        return service.login(loginForm.get("username"), loginForm.get("password"));
    }

    @PostMapping("/signup")
    public Long signup(@RequestBody SignupForm signupForm) {
        return service.signup(signupForm);
    }

    @GetMapping("/signup/check/{email}/exists")
    public ResponseEntity<Boolean> checkEmailDuplicate(@PathVariable String email) {
        return ResponseEntity.ok(service.checkEmailExists(email));
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
