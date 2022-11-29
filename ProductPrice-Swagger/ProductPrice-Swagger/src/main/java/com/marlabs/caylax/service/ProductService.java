package com.marlabs.caylax.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlabs.caylax.dto.ProductPriceDto;
import com.marlabs.caylax.entity.Product;
import com.marlabs.caylax.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;
	@Autowired
	private ModelMapper mapper;
	
	public List<ProductPriceDto> getProductPriceDto() {
		return repo.findAll().stream().map(this::convertModelToDto).collect(Collectors.toList());
	}
	
	private ProductPriceDto convertModelToDto(Product product) {
		ProductPriceDto dto=mapper.map(product, ProductPriceDto.class);
		return dto;
	}

}
