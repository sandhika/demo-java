
package com.backend.demo.repository; 
  
import com.backend.demo.entity.Category; 
import org.springframework.data.jpa.repository.JpaRepository; 
import java.util.Optional; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.query.Param; 
  
public interface CategoriesRepository extends JpaRepository<Category, Integer> { 
  
    @Query( 
        nativeQuery = true, 
        value 
        = "SELECT c.id, c.name, c.description FROM Category c join Product p on c.id = p.category_id where p.id=:productId") 
       Optional<Category> findCategoryByProductId(@Param("productId") int productId); 
}