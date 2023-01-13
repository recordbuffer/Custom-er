package com.shop.customer.repository;

import com.shop.customer.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByEmailAndPassword(String email, String password);
    boolean existsUsersByEmail(String email);
}
