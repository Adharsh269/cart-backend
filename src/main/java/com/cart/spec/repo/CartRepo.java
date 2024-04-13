package com.cart.spec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cart.spec.entity.CartEntity;

public interface CartRepo extends JpaRepository<CartEntity,String>{


}
