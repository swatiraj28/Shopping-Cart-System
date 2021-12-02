package com.casestudy.project.userprofile.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
@Document("UserProfile") //collection name in mongodb
public class UserProfile {
	//variables
@Id //making profile id as a primary key
  private String fullname;
  private int profileId;
  private String image;
  private String email;
  private Long mobileNumber;
  private String about;
  @JsonFormat(pattern="yyyy-MM-dd") 
  private LocalDate dateOfBirth;
  private String gender;
  private Role role;
  @Override
public int hashCode() {
	return Objects.hash(about, address, dateOfBirth, email, fullname, gender, image, mobileNumber, password, profileId,
			role);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	UserProfile other = (UserProfile) obj;
	return Objects.equals(about, other.about) && Objects.equals(address, other.address)
			&& Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(email, other.email)
			&& Objects.equals(fullname, other.fullname) && Objects.equals(gender, other.gender)
			&& Objects.equals(image, other.image) && Objects.equals(mobileNumber, other.mobileNumber)
			&& Objects.equals(password, other.password) && Objects.equals(profileId, other.profileId)
			&& role == other.role;
}
@Override
public String toString() {
	return "UserProfile [fullname=" + fullname + ", profileId=" + profileId + ", image=" + image + ", emailId="
			+ email + ", mobileNo=" + mobileNumber + ", about=" + about + ", dateOfBirth=" + dateOfBirth + ", gender="
			+ gender + ", role=" + role + ", password=" + password + ", address=" + address + "]";
}
public UserProfile() {
	super();
}
public UserProfile(String fullname, int profileId, String image, String emailId, Long mobileNo, String about,
		LocalDate dateOfBirth, String gender, Role role, String password, List<Address> address) {
	super();
	this.fullname = fullname;
	this.profileId = profileId;
	this.image = image;
	this.email = emailId;
	this.mobileNumber = mobileNo;
	this.about = about;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
	this.role = role;
	this.password = password;
	this.address = address;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public int getProfileId() {
	return profileId;
}
public void setProfileId(int profileId) {
	this.profileId = profileId;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getEmailId() {
	return email;
}
public void setEmailId(String emailId) {
	this.email = emailId;
}
public Long getMobileNo() {
	return mobileNumber;
}
public void setMobileNo(Long mobileNo) {
	this.mobileNumber = mobileNo;
}
public String getAbout() {
	return about;
}
public void setAbout(String about) {
	this.about = about;
}
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public List<Address> getAddress() {
	return address;
}
public void setAddress(List<Address> address) {
	this.address = address;
}
private String password;
  private List<Address> address;
}