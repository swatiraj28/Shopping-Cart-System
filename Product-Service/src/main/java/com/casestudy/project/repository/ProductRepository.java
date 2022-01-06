package com.casestudy.project.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.project.model.Product;
@Repository
public interface ProductRepository extends MongoRepository <Product ,Integer>
{

	List<Product> findByCategory(List<Product> category);

	List<Product> findByCategory(String category);


}
