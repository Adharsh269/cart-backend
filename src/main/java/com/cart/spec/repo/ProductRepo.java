package com.cart.spec.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cart.spec.entity.ProductsEntity;

public interface ProductRepo extends JpaRepository<ProductsEntity,String>{

}
