package com.casestudy.project.userprofile.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.casestudy.project.userprofile.model.UserProfile;
@Service
public interface ProfileService {
	
	public List <UserProfile> getAllProfiles(); 
	public Optional<UserProfile> getByProfile(int profileId);
	public  String deleteProfile(int profileId);
	public  UserProfile addNewMerchantProfile( UserProfile userprofile);
	public UserProfile addNewDeliverProfile(UserProfile userprofile);
    public String getByUserName();
	public UserProfile addNewCustomerProfile(UserProfile userprofile);
	public String updateProfile(UserProfile userprofile , int profileId);
	public Optional<UserProfile> findByMobileNo(Long mobileNo);
	//public Long  findByMobileNo(Long mobileNo);
	//public UserProfile addNewCustomerProfile();

	
	

}
