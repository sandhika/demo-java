package com.backend.demo.controller;

import com.backend.demo.response.CategoryResponse; 
import com.backend.demo.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RestController; 
  
@RestController
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService; 
  
    @GetMapping("/find-category-byproduct/{productId}") 
    public ResponseEntity<CategoryResponse> getCatgoryByProductId(@PathVariable("productId") int productId) { 
        CategoryResponse categoryResponse = categoryService.findCatgoeryByProductId(productId); 
        return ResponseEntity.status(HttpStatus.OK).body(categoryResponse); 
    } 
  
}