package com.cart.spec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.spec.entity.CartEntity;
import com.cart.spec.entity.LoginEntity;
import com.cart.spec.repo.CartRepo;
import com.cart.spec.repo.LoginRepo;

@Service
public class CartService {

	@Autowired
	CartRepo crepo;
	
	@Autowired
	LoginRepo userRepo;
	
	public List<CartEntity> addnewProduct(List<CartEntity> cr){
		return crepo.saveAll(cr);
	}
	 public List<CartEntity> getItems() {
	        return crepo.findAll();
	  }
	 public List<LoginEntity> addUser(List<LoginEntity> user ){
		 return userRepo.saveAll(user);
	 }
	 
	 public List<LoginEntity> getUser(){
		 return userRepo.findAll();
	 }
	 
	 public String checkIsValidUser(String name, String password) {
			
			LoginEntity lgUser = userRepo.findByUsername(name);
			
			if( (lgUser != null) && (lgUser.getPassword().contentEquals(password) == true)){
				
				return "success";
			}
			
			return "failure";
	}
	
}
