package com.qpAssesment.qpAssesment.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestDTO {
	
	private List<OrderItemRequest> items = new ArrayList<OrderRequestDTO.OrderItemRequest>();
	
	
    public List<OrderItemRequest> getItems() {
		return items;
	}


	public void setItems(List<OrderItemRequest> items) {
		this.items = items;
	}


	public static class OrderItemRequest {
        private Long groceryItemId;
        private Integer quantity;
		public Long getGroceryItemId() {
			return groceryItemId;
		}
		public void setGroceryItemId(Long groceryItemId) {
			this.groceryItemId = groceryItemId;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		public OrderItemRequest() {
			super();
			// TODO Auto-generated constructor stub
		}

        
    }
}
