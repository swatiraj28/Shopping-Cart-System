package com.casestudy.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.project.exception.ItemException;
import com.casestudy.project.model.Cart;
import com.casestudy.project.repository.CartRepository;

public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository cartRepository;

	@Override
	public Cart addCart(Cart cart) {
		if(cart.getItems().isEmpty()) {
			throw new ItemException("701","Cart is Empty!! Fill the Details");
		}
		
		return cartRepository.save(cart);
	}

	@Override
	public Optional<Cart> getCartById(int cartId) {
		Optional<Cart> findById= cartRepository.findById(cartId);
		if(findById.isEmpty()) {
			throw new ItemException("702","Cart is not available with this ID!! Wrong Request");
		}else {
			return cartRepository.findById(cartId);
		}
	}

	@Override
	public String updateCartDetails(Cart cart, int cartId) {
		boolean isProductExist = cartRepository.existsById(cartId);
		if(isProductExist) {
			cartRepository.save(cart);
			return "Update Cartdetails with id: "+cartId;
		}else {
			throw new ItemException("703","Cart Cannot be Updated !! Check The ID Again");
		}
		
	}

	@Override
	public List<Cart> getAllCarts() {
		List<Cart> cartList = cartRepository.findAll();
		if(cartList.isEmpty())
		{
			throw new ItemException("703","Cart Is Empty!! Nothing To Display ");
		}
		else 
		{
			return cartRepository.findAll();
		}
	}

	@Override
	public String deleteCartDetails(int cartId) {
		boolean isProductExist = cartRepository.existsById(cartId);
		if(isProductExist) {
			cartRepository.deleteById(cartId);
			 return "Delete Cartdetails with id: "+cartId;
		}
		else
		{
			throw new ItemException("704","OOPS! Cannot delete Cart !! No Cart found with this ID");
		}
	}

	
}
