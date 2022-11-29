package com.marlabs.caylax.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlabs.caylax.entity.Price;

public interface PriceRepo extends JpaRepository<Price, Integer> {

}
