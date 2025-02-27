package com.project.productservicemarch2025.controllers;

import com.project.productservicemarch2025.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {
        return null;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return null;
    }

    @PostMapping
    public Product addANewProduct(@RequestBody Product product) {
        return null;
    }

    @PutMapping("/id")
    public Product updateProductById(@PathVariable("id") Long productId, @RequestBody Product product) {
        return null;
    }

    @DeleteMapping("/id")
    public void deleteProductById(@PathVariable("id") Long id) {

    }
}
