package com.backend.demo.configuration;

import com.backend.demo.service.CategoryService; 
import org.modelmapper.ModelMapper; 
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 
  
@Configuration
public class CategoryConfig {
    
    @Bean
    public CategoryService categoryBean() {
        return new CategoryService();
    }

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }

}
