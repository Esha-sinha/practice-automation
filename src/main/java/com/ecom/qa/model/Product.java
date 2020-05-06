package com.ecom.qa.model;

import java.io.Serializable;

public class Product implements Serializable {

	private String productName;

	private double price;

	public void setProductName(String pn) {
		this.productName = pn;
	}

	public String getProductName() {
		return this.productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
