package com.shop.customer.domain.dtos;

import com.shop.customer.domain.Users;
import com.shop.customer.domain.eums.Role;
import lombok.Getter;

@Getter
public class SignupForm {
    private String name;
    private String email;
    private String password;

    public Users toEntity() {
        return Users.builder()
                .name(name)
                .email(email)
                .password(password)
                .role(Role.USER)
                .build();
    }
}
