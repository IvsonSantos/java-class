package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This is the class we use to connect our Object (Product) to the database and
 * have some operations already read to use
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
