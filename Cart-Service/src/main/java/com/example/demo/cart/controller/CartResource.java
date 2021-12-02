package com.example.demo.cart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cart.model.Cart;
import com.example.demo.cart.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartResource {

	@Autowired
	//for loose coupling
	CartService cartService;
	@PostMapping("/additemtocart")
	public Cart additemtocart(@RequestBody Cart cart) {
		return cartService.additemtocart(cart);
	}
	
	@GetMapping("/getallitems")
	public List<Cart> getAll() {
		return cartService.getAll();
	}
	@GetMapping("/getcartitembyid/{productName}")
	public Optional<Cart> getCartItemById(@PathVariable String productName){
		return cartService.getCartItemById(productName);
		
		
	}
	@DeleteMapping("/deleteitembyname/{productName}")
	public String deleteItembyId( String productName) 
	{
		return cartService.deleteItembyId(productName);
		
	}
	@PutMapping("/updateitem/{productName}")
	public String updateItemDetails(@RequestBody Cart cart, @PathVariable String productName) {
		cartService.additemtocart(cart);
		return "update item with product name" +  productName;
	}
}
