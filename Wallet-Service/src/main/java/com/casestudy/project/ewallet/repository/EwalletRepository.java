package com.casestudy.project.ewallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.project.ewallet.model.Ewallet;
import com.casestudy.project.ewallet.services.EwalletService;

public interface EwalletRepository extends MongoRepository<Ewallet ,String>{

}
