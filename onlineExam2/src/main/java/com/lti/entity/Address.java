package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_address")

public class Address {
	
	@Id
	@GeneratedValue
	@Column(name = "address_id")
	private int id;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "landmark")
	private String landmark;
	
	@Column(name = "locality")
	private String locality;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "pincode")
	private int pincode;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	public String getStreet() {
		return street;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
