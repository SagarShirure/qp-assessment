package com.qpAssesment.qpAssesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qpAssesment.qpAssesment.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
