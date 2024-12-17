package com.qpAssesment.qpAssesment.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qpAssesment.qpAssesment.dto.OrderRequestDTO;
import com.qpAssesment.qpAssesment.dto.OrderResponseDTO;
import com.qpAssesment.qpAssesment.model.GroceryItem;
import com.qpAssesment.qpAssesment.services.UserService;

@RestController
@RequestMapping("/v1/api/user")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("")
	public ResponseEntity<List<GroceryItem>> getGroceries(){
		List<GroceryItem> groceries = userService.getAllItems();
		
		return new ResponseEntity<>(groceries, HttpStatus.OK);
	}
	
	@PostMapping("/orders")
    public ResponseEntity<OrderResponseDTO> placeOrder(@RequestBody OrderRequestDTO orderRequest) {
		OrderResponseDTO response = userService.placeOrder(orderRequest);
		return new ResponseEntity<>(response, HttpStatus.OK);
    }
	
}
