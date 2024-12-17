package com.qpAssesment.qpAssesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qpAssesment.qpAssesment.model.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long>{

}
