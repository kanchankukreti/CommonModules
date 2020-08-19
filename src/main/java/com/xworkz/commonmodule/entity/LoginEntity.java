package com.xworkz.commonmodule.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="login_app")
public class LoginEntity {
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="rid")
	private int rId;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="mobileNumber")
	private String mobileNumber;
	
	public LoginEntity() {
		System.out.println("Calling from "+this.getClass().getSimpleName());
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
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
		return "LoginEntity [rId=" + rId + ", email=" + email + ", password=" + password + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	

}
