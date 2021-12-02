package com.casestudy.project.userprofile.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.casestudy.project.userprofile.model.Role;
import com.casestudy.project.userprofile.model.UserProfile;
import com.casestudy.project.userprofile.repository.ProfileRepository;


public class ProfileServiceImpl implements ProfileService {
	
    @Autowired
	ProfileRepository proRepo;
	
	@Override
	public UserProfile addNewCustomerProfile(UserProfile userprofile) {
		userprofile.setRole(Role.customer);
		UserProfile up= proRepo.save(userprofile);
		return up;
	}

	@Override

	public String updateProfile(UserProfile userprofile , int profileId) {
		proRepo.findById(profileId);
		proRepo.save(userprofile);
		return "Update user profile:"+profileId;
	}

	@Override
	public List<UserProfile> getAllProfiles() {
	return (List<UserProfile>) proRepo.findAll();
	}

	@Override
	public Optional<UserProfile> getByProfile(int profileId) {
		
		return proRepo.findById(profileId);
	} 

	@Override
	public String deleteProfile(int profileId) {
		proRepo.deleteById(profileId);
		return "Delete userprofile with id: "+profileId;
	}

	@Override
	public UserProfile addNewMerchantProfile(UserProfile userprofile) {
		userprofile.setRole(Role.merchant);
		 UserProfile up = proRepo.save(userprofile);
         return up;
	}

	@Override
	public UserProfile addNewDeliverProfile(UserProfile userprofile) {
		userprofile.setRole(Role.deliveryAgent);
		 UserProfile up = proRepo.save(userprofile);
        return up;
	}

	@Override
	//optional
	public Optional<UserProfile> findByMobileNo(Long mobileno) {
		Optional<UserProfile> up = proRepo.findByMobileNumber(mobileno);
		return up;
	}

	@Override
	public String getByUserName() {
		// TODO Auto-generated method stub
		return null;
	}



	}

	
