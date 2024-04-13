package com.cart.spec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cart.spec.entity.CartEntity;
import com.cart.spec.entity.LoginEntity;
import com.cart.spec.entity.ProductsEntity;
import com.cart.spec.service.CartService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;



@CrossOrigin("*")
@RestController
public class CartController {

	@Autowired
	CartService cser;
	
	
	@PostMapping("/cart/add")
	public List<CartEntity> postMethodName(@RequestBody List<CartEntity> cart) {
		//TODO: process POST request
		
		return cser.addnewProduct(cart);
	}
	@GetMapping("/cart/path")
	public List<CartEntity> getMethodName() {
		return cser.getItems();
	}
	
	@PostMapping("/add/user")
	public List<LoginEntity> postUsers(@RequestBody List<LoginEntity>  usr){
		return cser.addUser(usr);
	}
	
	@GetMapping("/get/user")
	public List<LoginEntity> getUsers(){
		return cser.getUser();
	}
	
	
	@GetMapping("/user/login")
	public String checkLogin(@RequestParam String username,@RequestParam String password) {
		return cser.checkIsValidUser(username,password);
	
	}
	
	
	@PostMapping("/add/pro")
	public List<ProductsEntity> postProduct(@RequestBody List<ProductsEntity>  p){
		return cser.addPro(p);
	}
	
	@GetMapping("/get/prd")
	public List<ProductsEntity> getProducts(){
		return cser.getProducts();
	}
	
}
