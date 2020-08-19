package com.xworkz.commonmodule.dto;

public class LoginDTO {
	private String email;
	private String password;
	private String mobileNumber;
	
	
	public LoginDTO() {
		System.out.println("calling from "+this.getClass().getSimpleName());
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "LoginDTO [email=" + email + ", password=" + password + ", mobileNumber=" + mobileNumber + "]";
	}
	

}
