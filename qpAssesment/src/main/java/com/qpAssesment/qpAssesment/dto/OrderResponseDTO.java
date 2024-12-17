package com.qpAssesment.qpAssesment.dto;

public class OrderResponseDTO {

	private Long orderId;
    private Double totalPrice;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
    
    
}
