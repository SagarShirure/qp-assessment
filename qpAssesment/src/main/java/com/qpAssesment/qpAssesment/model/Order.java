package com.qpAssesment.qpAssesment.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double totalPrice;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> items = new ArrayList<OrderItem>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public Order(Long id, Double totalPrice, List<OrderItem> items) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.items = items;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
