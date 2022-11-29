package com.marlabs.caylax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marlabs.caylax.dto.ProductPriceDto;
import com.marlabs.caylax.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping("/api/product")
	public List<ProductPriceDto> getAll() {
		return service.getProductPriceDto();
	}

}
