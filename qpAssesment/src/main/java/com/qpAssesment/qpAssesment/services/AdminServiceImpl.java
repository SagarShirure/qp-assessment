package com.qpAssesment.qpAssesment.services;

import org.springframework.stereotype.Service;

import com.qpAssesment.qpAssesment.model.GroceryItem;
import com.qpAssesment.qpAssesment.repository.GroceryItemRepo;

@Service
public class AdminServiceImpl implements AdminService {
	
	private GroceryItemRepo itemRepo;
	public AdminServiceImpl(GroceryItemRepo itemRepo) {
		super();
		this.itemRepo = itemRepo;
	}

	@Override
	public GroceryItem addGroceryItem(GroceryItem item) {
		// TODO Auto-generated method stub
		GroceryItem savedItem =itemRepo.save(item);
		return savedItem;
	}

	@Override
	public GroceryItem getGroceryItem(long id) {
		// TODO Auto-generated method stub
		GroceryItem item = itemRepo.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
		
		return item;
	}

	@Override
	public String removeItem(long id) {
		// TODO Auto-generated method stub
		GroceryItem item = getGroceryItem(id);
		itemRepo.delete(item);
		return "Item deleted successfully";
	}

	@Override
	public GroceryItem updateGroceryItem(long id, GroceryItem item) {
		// TODO Auto-generated method stub
		GroceryItem itemSaved = getGroceryItem(id);
		itemSaved.setName(item.getName());
		itemSaved.setPrice(item.getPrice());
		itemSaved.setStock(item.getStock());
		itemRepo.save(itemSaved);
		return itemSaved;
	}

	@Override
	public GroceryItem updateInventory(long id, int stock) {
		// TODO Auto-generated method stub
		GroceryItem itemSaved = getGroceryItem(id);
		itemSaved.setStock(itemSaved.getStock() + stock);
		itemRepo.save(itemSaved);
		return itemSaved;
	}

}
