package com.qpAssesment.qpAssesment.services;

import org.springframework.stereotype.Service;

import com.qpAssesment.qpAssesment.model.GroceryItem;

@Service
public interface AdminService {

	GroceryItem addGroceryItem( GroceryItem item);
	GroceryItem getGroceryItem( long id);
	String removeItem(long id);
	GroceryItem updateGroceryItem(long id, GroceryItem item);
	GroceryItem updateInventory(long id, int stock);
}
