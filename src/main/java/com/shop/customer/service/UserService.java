package com.shop.customer.service;

import com.shop.customer.domain.Users;
import com.shop.customer.domain.dtos.SignupForm;
import com.shop.customer.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@Transactional
public class UserService {

    private final BCryptPasswordEncoder encoder;
    private final UserRepository repository;

    public UserService(BCryptPasswordEncoder encoder, UserRepository repository) {
        this.encoder = encoder;
        this.repository = repository;
    }

    public Long login(String email, String password) {
        Users user = repository.findByEmailAndPassword(email, password);
        if(user!=null) {
            return user.getId();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public Long signup(SignupForm signupForm) {
        boolean check = checkEmailExists(signupForm.getEmail());

        if (check) {
            throw new IllegalArgumentException("이미 존재하는 유저입니다.");
        }

        String encPwd = encoder.encode(signupForm.getPassword());

        Users user = repository.save(signupForm.toEntity(encPwd));

        if(user!=null) {
            return user.getId();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public boolean checkEmailExists(String email) {
       return repository.existsUsersByEmail(email);
    }

}
