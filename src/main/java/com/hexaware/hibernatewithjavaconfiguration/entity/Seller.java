package com.hexaware.hibernatewithjavaconfiguration.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seller {
	
	@Id
	private Long sellerId;
	
	private String sellerName;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + "]";
	}
	
	

}
