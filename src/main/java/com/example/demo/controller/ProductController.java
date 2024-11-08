package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This is the class where we create the endpoints for the PRODUCT entity
 */
@RestController
@RequestMapping("/product") // localhost:8080/product
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all") // localhost:8080/product/all
    public List<Product> findAll() {
        return productService.findAll();
    }

    // order by name
    @GetMapping("/ordered")
    public List<Product> getOrdered() {
        return productService.getOrdered();
    }

    // average of value
    @GetMapping("/average")
    public Double getAverage() {
        return productService.getAverage();
    }

    // sum of all values
    @GetMapping("/total")
    public Integer getTotal() {
        return productService.getTotal();
    }

    // count of products
    @GetMapping("/count")
    public Integer getCount() {
        return productService.getCount();
    }

    // get by id
    @GetMapping("/{id}")
    public Product getById(@RequestParam Integer id) {
        return productService.getById(id);
    }

}
