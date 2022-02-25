package com.casestudy.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.models.UserProfile;



public interface ProfileRepository extends MongoRepository<UserProfile, String> {

	Optional<UserProfile> findByMobileNumber(long mobileNumber);

	Optional<UserProfile> findByEmail(String email);

}