package com.casestudy.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.project.model.Cart;
import com.casestudy.project.model.Product;

@Repository
public interface CartRepository extends MongoRepository<Cart,Integer>{

	
	
	 
}