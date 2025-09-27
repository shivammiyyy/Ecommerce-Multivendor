package com.Ecommerce_Multivendor.Backend.repository;

import java.util.List;

import com.Ecommerce_Multivendor.Backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByCategoryId(String categoryId);

    List<Category>findByLevel(Integer level);

}
