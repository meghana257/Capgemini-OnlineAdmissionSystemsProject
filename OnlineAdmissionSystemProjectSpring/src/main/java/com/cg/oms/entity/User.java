package com.cg.oms.entity;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User{
	@Id		
	
	private String userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String aadharCardNo;
	
	
	public User() {
		
	}
	
	public User(String userId, String firstName, String middleName, String lastName, String email, String mobileNumber,
			String aadharCardNo) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.aadharCardNo = aadharCardNo;
		
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAadharCardNo() {
		return aadharCardNo;
	}
	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	

	
	
	
	
}
