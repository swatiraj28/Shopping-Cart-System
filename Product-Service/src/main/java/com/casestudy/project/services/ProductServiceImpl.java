package com.casestudy.project.services;

import java.util.List;
import java.util.Optional;

//implementation class

import org.springframework.beans.factory.annotation.Autowired;


import com.casestudy.project.exceptionhandling.EmptyInputException;
import com.casestudy.project.exceptionhandling.ProductNotFoundException;
import com.casestudy.project.model.Product;
import com.casestudy.project.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
	@Autowired 
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		List<Product> product= productRepository.findAll();
		if(product.isEmpty()) {
			throw new EmptyInputException("501","Product not Found !! Check Again");
		}else
		{
			return product;
			
		}
	}

	@Override
	public Optional<Product> getProductById(int productId) {
		Optional<Product> findByid =productRepository.findById(productId);
		if(findByid.isEmpty()){
			throw new ProductNotFoundException("502" ,"Product not Found !! Check Again");
		}else
		{
			return productRepository.findById(productId);
			
		}
	}

	@Override
	public Product addProduct(Product product) {
		if(product.getProductName().isBlank() || product.getProductName().length()==0) {
			throw new EmptyInputException("503"," Value Field cannot be null !!");
		}
		else
			return productRepository.save(product);
	}


	@Override
	public String updateProduct(Product product, int productId) 
	{
		boolean isProductExist = productRepository.existsById(productId);
		if(isProductExist)
		{
		    productRepository.save(product);
		    return "Product updated"+productId;
		}
		else
		{
			throw new ProductNotFoundException("504" ,"Product Not Found !!");
		}
	}

	@Override
	public String deleteByProductId(Product product, int productId) {
		boolean isProductExist= productRepository.existsById(productId);
		if(isProductExist) {
		    productRepository.deleteById(productId);
		    return "Product deleted"+productId;
		}
		else {
			throw new ProductNotFoundException("505" ,"Product Not Found !!");
		}
	}


}
