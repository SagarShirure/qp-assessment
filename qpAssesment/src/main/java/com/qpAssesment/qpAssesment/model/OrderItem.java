package com.qpAssesment.qpAssesment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderItem {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long groceryItemId;
    private String name;
    private Integer quantity;
    private Double price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getGroceryItemId() {
		return groceryItemId;
	}
	public void setGroceryItemId(Long groceryItemId) {
		this.groceryItemId = groceryItemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public OrderItem(Long id, Long groceryItemId, String name, Integer quantity, Double price) {
		super();
		this.id = id;
		this.groceryItemId = groceryItemId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
