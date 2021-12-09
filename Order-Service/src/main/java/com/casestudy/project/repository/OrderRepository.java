package com.casestudy.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.casestudy.project.model.Orders;
@Repository
public interface OrderRepository extends MongoRepository<Orders , Integer>{




}
