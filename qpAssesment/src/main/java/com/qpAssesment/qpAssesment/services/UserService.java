package com.qpAssesment.qpAssesment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qpAssesment.qpAssesment.dto.OrderRequestDTO;
import com.qpAssesment.qpAssesment.dto.OrderResponseDTO;
import com.qpAssesment.qpAssesment.model.GroceryItem;

@Service
public interface UserService {

	List<GroceryItem> getAllItems();

	OrderResponseDTO placeOrder(OrderRequestDTO orderRequest);
	
}
