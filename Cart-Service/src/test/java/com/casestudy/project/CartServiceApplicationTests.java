package com.casestudy.project;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.casestudy.project.model.Cart;
import com.casestudy.project.model.Items;
import com.casestudy.project.repository.CartRepository;
import com.casestudy.project.service.CartService;
import org.assertj.core.api.Assertions;

@SpringBootTest
@RunWith(SpringRunner.class)
class CartServiceApplicationTests {
	@Autowired
	private CartService cartService;
	
	@MockBean
	private CartRepository cartRepo;

	private Cart user1;

	@Test
	 public void getAllCartTest()
	 {
		when(cartRepo.findAll()).thenReturn(Stream.of
				(new Cart(2,1000.0,"Clothe",20000.0,3),new Cart(2,1000.0,"Watch",10000.0,3))
				.collect(Collectors.toList()));
		assertEquals(2,cartService.getAllCarts().size());
	 }
	@Test
	public void addCart() 
	{
		Cart cart = new Cart(2,1000.0,Arrays.asList(new Items("chocolate",100.0,3)));
	    when(cartRepo.save(cart)).thenReturn(cart);
	    assertEquals(cart,cartService.addCart(cart));
	
	}
	
	@Test
	  @Order(1)
    @Rollback(value = false)
	public void delCart()
	{
		cartRepo.deleteById(1);
		Cart cart1 = null;
		Optional<Cart> optionalUser=cartRepo.findById(1);
		if(optionalUser.isPresent())
		{
			cart1 = optionalUser.get();
			
		}
		Assertions.assertThat(cart1).isNull();
		
	}
	
	
	
	
}
