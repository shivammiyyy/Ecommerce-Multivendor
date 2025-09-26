package com.Ecommerce_Multivendor.Backend.repository;


import com.Ecommerce_Multivendor.Backend.model.Category;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

   Category findByCategoryId(@NotNull String categoryId);


}
