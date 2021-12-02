package com.example.demo.cart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.cart.model.Cart;

@Repository
public interface CartRepository extends MongoRepository<Cart, String>{
	
	 Cart findByCartId(String productName);
}
