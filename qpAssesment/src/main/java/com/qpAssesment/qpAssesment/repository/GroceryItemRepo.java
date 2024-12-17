package com.qpAssesment.qpAssesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qpAssesment.qpAssesment.model.GroceryItem;

public interface GroceryItemRepo extends JpaRepository<GroceryItem, Long> {

}
