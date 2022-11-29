package com.marlabs.caylax.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlabs.caylax.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
