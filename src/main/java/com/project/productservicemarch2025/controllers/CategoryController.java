package com.project.productservicemarch2025.controllers;

import com.project.productservicemarch2025.models.Category;
import com.project.productservicemarch2025.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @GetMapping
    public List<Category> getAllCategories() {
        return null;
    }

    @GetMapping("/{name}")
    public List<Product> getAllProductsInACategory(@PathVariable("name") String categoryName) {
        return null;
    }
}
