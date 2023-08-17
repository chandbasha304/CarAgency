package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity	
public class Customers {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	
	private String customername;
	
	private String customeraddress;
	private String customernumber;
	private String customermail;
	private String customerlicense;
	private String customerpassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public String getCustomernumber() {
		return customernumber;
	}
	public void setCustomernumber(String customernumber) {
		this.customernumber = customernumber;
	}
	public String getCustomermail() {
		return customermail;
	}
	public void setCustomermail(String customermail) {
		this.customermail = customermail;
	}
	public String getCustomerlicense() {
		return customerlicense;
	}
	public void setCustomerlicense(String customerlicense) {
		this.customerlicense = customerlicense;
	}
	public String getCustomerpassword() {
		return customerpassword;
	}
	public void setCustomerpassword(String customerpassword) {
		this.customerpassword = customerpassword;
	}
	@Override
	public String toString() {
		return "Customers [id=" + id + ", customername=" + customername + ", customeraddress=" + customeraddress
				+ ", customernumber=" + customernumber + ", customermail=" + customermail + ", customerlicense="
				+ customerlicense + ", customerpassword=" + customerpassword + "]";
	}
	public Customers() {
	}
	public Customers(int id, String customername, String customeraddress, String customernumber, String customermail,
			String customerlicense, String customerpassword) {
		this.id = id;
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.customernumber = customernumber;
		this.customermail = customermail;
		this.customerlicense = customerlicense;
		this.customerpassword = customerpassword;
	}
	
	

}
