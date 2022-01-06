package com.casestudy.project.services;

import java.util.List;
import java.util.Optional;

import com.casestudy.project.model.Product;

public interface ProductService {
	List<Product> getAllProducts();
	Optional<Product> getProductById(int productId);
	Product addProduct(Product product);
	String updateProduct(Product product , int productId);
	String deleteByProductId(Product product , int productId);
	List<Product> getProductByCategory(String category);
	

}
