package com.example.demo.cart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.cart.model.Cart;
import com.example.demo.cart.repository.CartRepository;

public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepo;

	@Override
	public Cart additemtocart(Cart cart) {
		Cart c=cartRepo.save(cart);
		return c;
	}

	@Override
	public List<Cart> getAll() {
		return cartRepo.findAll();
	}

	@Override
	public Optional<Cart> getCartItemById(String productName) {
		return cartRepo.findById(productName);
	}

	@Override
	public String deleteItembyId(String productName) {
		cartRepo.deleteById(productName);
		return "deleted with product name "+ productName;
	}

	@Override
	public String updateItemDetails(Cart cart,String productName) {
		cartRepo.findByCartId(productName);
		cartRepo.save(cart);
		return "updated cart item with product name" + productName;
	}
	
	
}
