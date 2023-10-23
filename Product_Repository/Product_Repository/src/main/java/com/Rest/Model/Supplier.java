package com.Rest.Model;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Supplier {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	private String SName;
	
	@Column(nullable = false)
	private String Contact;
	
	@Column(nullable = false)
	private String Email;
	
	@Column(nullable = false)
	private String Address;
    
	@CreatedDate
    private Instant CreatedAt;
    
	@LastModifiedDate
    private Instant UpdatedAt;

	public Supplier() {
		
	}

	public Supplier(int id, String sName, String contact, String email, String address) {
		
		this.id = id;
		SName = sName;
		Contact = contact;
		Email = email;
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	}


