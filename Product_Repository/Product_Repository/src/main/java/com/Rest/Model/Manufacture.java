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
	public class Manufacture {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column(nullable = false)
		private String mnfProduct;
		
		@Column(nullable = false)
		private String mnfDate;
		
		@Column(nullable = false)
		private String Rating ;
		
		@CreatedDate
		private Instant CreatedAt;
		
		@LastModifiedDate
		private Instant UpdatedAt;

		
		public Manufacture() {
			}


		public Manufacture(int id, String mnfProduct, String mnfDate, String rating, Instant createdAt,
				Instant updatedAt) {
			this.id = id;
			this.mnfProduct = mnfProduct;
			this.mnfDate = mnfDate;
			this.Rating = rating;
			this.CreatedAt = createdAt;
			this.UpdatedAt = updatedAt;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getMnfProduct() {
			return mnfProduct;
		}


		public void setMnfProduct(String mnfProduct) {
			this.mnfProduct = mnfProduct;
		}


		public String getMnfDate() {
			return mnfDate;
		}


		public void setMnfDate(String mnfDate) {
			this.mnfDate = mnfDate;
		}


		public String getRating() {
			return Rating;
		}


		public void setRating(String rating) {
			Rating = rating;
		}


		public Instant getCreatedAt() {
			return CreatedAt;
		}


		public void setCreatedAt(Instant createdAt) {
			CreatedAt = createdAt;
		}


		public Instant getUpdatedAt() {
			return UpdatedAt;
		}


		public void setUpdatedAt(Instant updatedAt) {
			UpdatedAt = updatedAt;
		}
		

}
