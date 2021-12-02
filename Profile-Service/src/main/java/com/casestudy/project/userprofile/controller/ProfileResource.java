package com.casestudy.project.userprofile.controller;

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
import org.springframework.web.client.RestTemplate;

import com.casestudy.project.userprofile.model.UserProfile;
import com.casestudy.project.userprofile.services.ProfileService;
import com.casestudy.project.userprofile.services.ProfileServiceImpl;

@RestController
@RequestMapping("/userprofile")
public class ProfileResource {
	//controller class
   @Autowired //here we are calling bean instance
	ProfileService proService;
	
	@PostMapping("/addcustomer")
    public UserProfile addNewCustomerProfile(@RequestBody UserProfile userprofile) {
		return proService.addNewCustomerProfile(userprofile);
	}
    public UserProfile addNewMerchantProfile() {
		return null;
	}
    public UserProfile deliveryProfile() {
		return null;
	}
    
    public List <UserProfile> getAllProfiles() {
		return null;
	}
    @GetMapping("/getbyid/{profileId}")
    public Optional<UserProfile> getByProfile(@PathVariable("profileId") int profileId){
		return proService.getByProfile(profileId);
	}
    @PutMapping("/updatecustomer/{profileId}")
     public String updateProfile(@RequestBody UserProfile userprofile , @PathVariable("profileId") int profileId) {
    	proService.getByProfile(profileId);
    	proService.addNewCustomerProfile(userprofile);
    	return "updated customer profile" + profileId;
	}
    //delete the customer profile by profileId
    @DeleteMapping("/delete/{profileId}")
    public String deleteProfile(@PathVariable int profileId) {
    proService.deleteProfile(profileId);
    return "Delete userprofilewith id: "+profileId;
    }
     
    public UserProfile getByUserName() {
		return null;
	}
    

}
