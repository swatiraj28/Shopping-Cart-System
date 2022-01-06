package com.casestudy.project;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.casestudy.project.exceptionhandling.EmptyInputException;
import com.casestudy.project.model.Product;
import com.casestudy.project.repository.ProductRepository;
import com.casestudy.project.services.ProductService;

import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class) // from here junit testing starts
	@SpringBootTest //indicates the test class
	class ProductServiceApplicationTests {

		
  @Autowired
  ProductRepository productRepository;
	
	@Test
	public void testCreate() {
	Product p=new Product();
	p.setProductId(56);
	p.setProductType("gadgets");
	p.setProductName("iphone");
	p.setCategory("Electronics");
	p.setImage("img.jpg");
	p.setPrice(500.00);
	p.setDescription("good");
	p.setRating(5);
	
	productRepository.save(p);
	assertNotNull(productRepository.findById(5).get());
	}
	@Test
	public void testReadAll() {
	List<Product> list = productRepository.findAll();
	assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	public void testupdate() {
	Product p = productRepository.findById(3).get();
	p.setPrice(600.00);
	productRepository.save(p);
	assertNotEquals(700.00,productRepository.findById(3).get().getPrice());

	}

	@Test
	public void testDelete() {
	productRepository.deleteById(1);
	assertThat(productRepository.existsById(1)).isFalse();
	}
		
		 
		}

