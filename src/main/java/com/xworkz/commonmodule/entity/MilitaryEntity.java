package com.xworkz.commonmodule.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="military_app")
public class MilitaryEntity implements Serializable{
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="S_No")
	private int sNo;
	@Column(name="Country_Name")
	private String countryName;
	@Column(name="Military_Type")
	private String militaryType;
	@Column(name="Equipment")
	private String equipment;
	@Column(name="Price")
	private long price;
	@Column(name="Quantity")
	private long quantity;
	@Column(name="Delivery_Year")
	private int deliveryYear;
	
	public MilitaryEntity() {
		System.out.println("hey this is /t"+this.getClass().getSimpleName());
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getMilitaryType() {
		return militaryType;
	}
	public void setMilitaryType(String militaryType) {
		this.militaryType = militaryType;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public int getDeliveryYear() {
		return deliveryYear;
	}
	public void setDeliveryYear(int deliveryYear) {
		this.deliveryYear = deliveryYear;
	}
	public MilitaryEntity(int sNo, String countryName, String militaryType, String equipment, long price, long quantity,
			int deliveryYear) {
		super();
		this.sNo = sNo;
		this.countryName = countryName;
		this.militaryType = militaryType;
		this.equipment = equipment;
		this.price = price;
		this.quantity = quantity;
		this.deliveryYear = deliveryYear;
	}
	@Override
	public String toString() {
		return "MilitaryEntity [sNo=" + sNo + ", countryName=" + countryName + ", militaryType=" + militaryType
				+ ", equipment=" + equipment + ", price=" + price + ", quantity=" + quantity + ", deliveryYear="
				+ deliveryYear + "]";
	}
	
	

}
