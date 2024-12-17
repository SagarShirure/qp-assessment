package com.qpAssesment.qpAssesment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GroceryItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	String name;
	
	Double price;
	
	int stock;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public GroceryItem(long id, String name, Double price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public GroceryItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
