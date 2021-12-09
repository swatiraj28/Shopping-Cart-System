package com.casestudy.project.service;

import java.util.List;
import java.util.Optional;

import com.casestudy.project.model.Cart;

public interface CartService {

	public Cart addCart( Cart cart);
	public Optional<Cart> getCartById(int cartId);
	public String updateCartDetails( Cart cart,  int cartId);
	public List<Cart> getAllCarts();
	public String deleteCartDetails( int cartId);
}
