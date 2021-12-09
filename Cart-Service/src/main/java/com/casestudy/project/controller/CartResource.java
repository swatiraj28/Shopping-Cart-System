package com.casestudy.project.controller;

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

import com.casestudy.project.model.Cart;
import com.casestudy.project.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartResource {

	@Autowired
	CartService cartService;
	
	//adds item the Cart
  	@PostMapping("/addCart")
  	public Cart addCart(@RequestBody Cart cart) {
  		return  cartService.addCart(cart);
  	}
  	
  	//GET all Carts details
  	@GetMapping("/getallcarts")
  	public List<Cart> getAllCarts(){
  		return cartService.getAllCarts();
  	}
  	
  	//Get the cart details
  	@GetMapping("/getallcartdetails/{cartId}")
  	public Optional<Cart> getCartById(@PathVariable int cartId){
  		return cartService.getCartById(cartId);
  	}
  	
  	//delete the cart details using ID
  	
  	@DeleteMapping("/delete/{cartId}")
  	public String deleteCartDetails(@PathVariable int cartId) {
  		cartService.deleteCartDetails(cartId);
  		 return "Delete Cart with id: "+ cartId;
  	}
  	
  	//update the cart by ID
  	@PutMapping("/update/{cartId}")
  	public String updateCartDetails(@RequestBody Cart cart, @PathVariable int cartId) {
  		cartService.updateCartDetails(cart, cartId);
  		return "Update Cart with id: "+ cartId;
  	}
  	
}
