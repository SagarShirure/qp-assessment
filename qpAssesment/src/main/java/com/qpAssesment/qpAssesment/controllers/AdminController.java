package com.qpAssesment.qpAssesment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qpAssesment.qpAssesment.model.GroceryItem;
import com.qpAssesment.qpAssesment.services.AdminService;

@RestController
@RequestMapping("/v1/api/admin/groceries")
public class AdminController {

	private AdminService adminService;

	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@PostMapping("")
	public ResponseEntity<GroceryItem> addGroceryItem(@RequestBody GroceryItem item){
		GroceryItem savedItem = adminService.addGroceryItem(item);
		
		return new ResponseEntity<GroceryItem>(savedItem, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<GroceryItem> getItem(@PathVariable int id){
		GroceryItem item = adminService.getGroceryItem(id);
		
		return new ResponseEntity<GroceryItem>(item, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<GroceryItem> updateGrocery(@PathVariable Long id, @RequestBody GroceryItem groceryItem) {
		GroceryItem item = adminService.updateGroceryItem(id, groceryItem);
		return new ResponseEntity<GroceryItem>(item, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteGrocery(@PathVariable Long id) {
        String msg =adminService.removeItem(id);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @PutMapping("/{id}/stock")
    public ResponseEntity<GroceryItem> updateStock(@PathVariable Long id, @RequestParam Integer stock) {
    	GroceryItem item = adminService.updateInventory(id, stock);
        return new ResponseEntity<GroceryItem>(item, HttpStatus.OK);
    }
}
