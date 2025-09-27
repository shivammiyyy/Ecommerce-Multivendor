package com.Ecommerce_Multivendor.Backend.controller;


import com.Ecommerce_Multivendor.Backend.model.Home;
import com.Ecommerce_Multivendor.Backend.model.HomeCategory;
import com.Ecommerce_Multivendor.Backend.service.HomeCategoryService;
import com.Ecommerce_Multivendor.Backend.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeCategoryController {

    private final HomeCategoryService homeCategoryService;
    private final HomeService hOmeService;

    @PostMapping("/home/categories")
    public ResponseEntity<Home> createHomeCategories(@RequestBody List<HomeCategory> homeCategories){

        List<HomeCategory> categories = homeCategoryService.createCategories(homeCategories);
        Home home = hOmeService.creatHomePageData(categories);

        return new ResponseEntity<>(home, HttpStatus.ACCEPTED);
    }


    @GetMapping("/admin/home-category")
    public ResponseEntity<List<HomeCategory>> getHomeCategory() {
        List<HomeCategory> categories = homeCategoryService.getAllCategories();
        return ResponseEntity.ok(categories);
    }

    @PatchMapping("/admin/home-category/{id}")
    public ResponseEntity<HomeCategory> updateHomeCategory(@PathVariable Long id, @RequestBody HomeCategory homeCategory) throws Exception{
        HomeCategory updatedCategory = homeCategoryService.updateCategory(homeCategory, id);
        return ResponseEntity.ok(updatedCategory);
    }
}
