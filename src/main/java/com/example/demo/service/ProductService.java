package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * This is the core class of Product, where we should put all the logic from
 * the domain
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> getOrdered() {
        List<Product> products = productRepository.findAll();
        // TODO implement the logic here
        return null;
    }

    public Double getAverage() {
        List<Product> products = productRepository.findAll();
        // TODO implement the logic here
        return null;
    }

    public Integer getTotal() {
        List<Product> products = productRepository.findAll();
        // TODO implement the logic here
        return null;
    }

    public Integer getCount() {
        List<Product> products = productRepository.findAll();
        // TODO implement the logic here
        return null;
    }

    public Product getById(Integer id) {
        Optional<Product> product = productRepository.findById(id);
        // TODO implement the logic here
        return null;
    }

}
