package com.casestudy.project.ewallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.project.ewallet.model.Statement;

public interface StatementsRepository extends MongoRepository<Statement, String> {

}
