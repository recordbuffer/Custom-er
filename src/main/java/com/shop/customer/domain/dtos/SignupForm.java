package com.shop.customer.domain.dtos;

import com.shop.customer.domain.Users;
import com.shop.customer.domain.eums.Role;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
public class SignupForm {
    @NotBlank(message = "이름을 입력해주세요.")
    private String name;
    @NotBlank(message = "이메일 주소를 입력해주세요.")
    @Email(message = "올바른 형식의 이메일 주소를 입력해주세요.")
    private String email;
    @NotBlank(message = "비밀번호를 입력해주세요.")
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
