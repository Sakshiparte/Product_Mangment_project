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
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false)
	private String BrandName;
    
	@CreatedDate
	private Instant CreatedAt;
	
	@LastModifiedDate
	private Instant UpdatedAt;

	public Brand() {
		}

	public Brand(int id, String brandName) {
		
		this.id = id;
		BrandName = brandName;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public Instant getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(Instant createdAt) {
		CreatedAt = createdAt;
	}
	
	
}


