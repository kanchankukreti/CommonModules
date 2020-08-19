package com.xworkz.commonmodule.dto;

public class MilitaryDTO {
	
	
	private String countryName;
	private String militaryType;
	private String equipment;
	private long price;
	private long quantity;
	private int deliveryYear;
	
	public MilitaryDTO() {
		System.out.println("calling from /t"+this.getClass().getSimpleName());
	}
	
	@Override
	public String toString() {
		return "MilitaryDTO [countryName=" + countryName + ", militaryType=" + militaryType + ", equipment=" + equipment
				+ ", price=" + price + ", quantity=" + quantity + ", deliveryYear=" + deliveryYear + "]";
	}

	public MilitaryDTO(String countryName, String militaryType, String equipment, long price, long quantity,
			int deliveryYear) {
		super();
		this.countryName = countryName;
		this.militaryType = militaryType;
		this.equipment = equipment;
		this.price = price;
		this.quantity = quantity;
		this.deliveryYear = deliveryYear;
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

	
}
