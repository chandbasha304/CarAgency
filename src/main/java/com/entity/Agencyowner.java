package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "agencyowner")
public class Agencyowner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String agencyname;
	
	private String ownername;
	private String ownermail;
	private String ownernumber;
	private String owneraddress;
	private String ownerpassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAgencyname() {
		return agencyname;
	}
	public void setAgencyname(String agencyname) {
		this.agencyname = agencyname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getOwnermail() {
		return ownermail;
	}
	public void setOwnermail(String ownermail) {
		this.ownermail = ownermail;
	}
	public String getOwnernumber() {
		return ownernumber;
	}
	public void setOwnernumber(String ownernumber) {
		this.ownernumber = ownernumber;
	}
	public String getOwneraddress() {
		return owneraddress;
	}
	public void setOwneraddress(String owneraddress) {
		this.owneraddress = owneraddress;
	}
	public String getOwnerpassword() {
		return ownerpassword;
	}
	public void setOwnerpassword(String ownerpassword) {
		this.ownerpassword = ownerpassword;
	}
	@Override
	public String toString() {
		return "Agencyowner [id=" + id + ", agencyname=" + agencyname + ", ownername=" + ownername + ", ownermail="
				+ ownermail + ", ownernumber=" + ownernumber + ", owneraddress=" + owneraddress + ", ownerpassword="
				+ ownerpassword + "]";
	}
	public Agencyowner(int id, String agencyname, String ownername, String ownermail, String ownernumber,
			String owneraddress, String ownerpassword) {
		this.id = id;
		this.agencyname = agencyname;
		this.ownername = ownername;
		this.ownermail = ownermail;
		this.ownernumber = ownernumber;
		this.owneraddress = owneraddress;
		this.ownerpassword = ownerpassword;
	}
	public Agencyowner() {
	
	}
	
	

}
