package com.cart.spec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cart.spec.entity.LoginEntity;

public interface LoginRepo extends JpaRepository<LoginEntity, String> {

	LoginEntity findByUsername(String username);

}
