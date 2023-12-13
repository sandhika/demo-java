package com.backend.demo.service;

import com.backend.demo.entity.Category; 
import com.backend.demo.repository.CategoriesRepository; 
import com.backend.demo.response.CategoryResponse; 
import org.modelmapper.ModelMapper; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Service; 
  
import java.util.Optional; 
  
@Service
public class CategoryService {
    
    @Autowired
    private CategoriesRepository categoryRepo; 
  
    @Autowired
    private ModelMapper mapper; 
  
    public CategoryResponse findCatgoeryByProductId(int productId) { 
        Optional<Category> categoryByProductId = categoryRepo.findCategoryByProductId(productId); 
        CategoryResponse  categoryResponse = mapper.map(categoryByProductId, CategoryResponse.class); 
        return categoryResponse; 
    } 

}
