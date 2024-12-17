package com.qpAssesment.qpAssesment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qpAssesment.qpAssesment.dto.OrderRequestDTO;
import com.qpAssesment.qpAssesment.dto.OrderResponseDTO;
import com.qpAssesment.qpAssesment.model.GroceryItem;
import com.qpAssesment.qpAssesment.model.Order;
import com.qpAssesment.qpAssesment.model.OrderItem;
import com.qpAssesment.qpAssesment.repository.GroceryItemRepo;
import com.qpAssesment.qpAssesment.repository.OrderRepository;

@Service
public class UserServiceImpl implements UserService{
	
	private GroceryItemRepo itemRepo;
	private OrderRepository orderRepository;
	public UserServiceImpl(GroceryItemRepo itemRepo, OrderRepository orderRepository) {
		super();
		this.itemRepo = itemRepo;
		this.orderRepository = orderRepository;
	}



	@Override
	public List<GroceryItem> getAllItems() {
		// TODO Auto-generated method stub
		
		List<GroceryItem> items = itemRepo.findAll();
		return items;
	}



	@Override
	public OrderResponseDTO placeOrder(OrderRequestDTO orderRequest) {
		Double totalPrice = 0.0;

        Order order = new Order();
        for (OrderRequestDTO.OrderItemRequest itemRequest : orderRequest.getItems()) {
            GroceryItem item = itemRepo.findById(itemRequest.getGroceryItemId())
                            .orElseThrow(() -> new RuntimeException("Item not found"));
            if (item.getStock() < itemRequest.getQuantity()) {
                throw new RuntimeException("Insufficient stock for item: " + item.getName());
            }

            item.setStock(item.getStock() - itemRequest.getQuantity());

            totalPrice += item.getPrice() * itemRequest.getQuantity();

            OrderItem orderItem = new OrderItem();
            orderItem.setGroceryItemId(item.getId());
            orderItem.setName(item.getName());
            orderItem.setQuantity(itemRequest.getQuantity());
            orderItem.setPrice(item.getPrice());
            order.getItems().add(orderItem);
        }

        order.setTotalPrice(totalPrice);
        orderRepository.save(order);

        OrderResponseDTO response = new OrderResponseDTO();
        response.setOrderId(order.getId());
        response.setTotalPrice(totalPrice);

        return response;
	}

	
	
}
