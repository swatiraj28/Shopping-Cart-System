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

import com.casestudy.project.model.Product;
import com.casestudy.project.services.ProductService;

@RestController // Controller class
@RequestMapping("/api/product")
public class ProductResource {
	@Autowired   //for loose coupling
	ProductService productService;
	
	@GetMapping("/getallproduct")
	public List<Product> getAllProducts() {
	return productService.getAllProducts();
	}
	@GetMapping("/getproductbyid/{productId}")
	public Optional<Product> getProductById(@PathVariable int productId){

	return productService.getProductById(productId);
	}
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@PutMapping("/updateproduct/{productId}")
	public String updateProduct(@RequestBody Product product,@PathVariable int productId ) {
	return productService.updateProduct(product, productId);
	}


	@DeleteMapping("/deleteproductbyid/{productId}")
	public String deleteByProductId(@RequestBody Product product,@PathVariable ("productId") int productId) {

	return productService.deleteByProductId(product, productId);
	}
	





}
