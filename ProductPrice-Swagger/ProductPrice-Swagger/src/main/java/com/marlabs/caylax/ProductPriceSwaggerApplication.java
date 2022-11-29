package com.marlabs.caylax;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.marlabs.caylax.entity.Price;
import com.marlabs.caylax.entity.Product;
import com.marlabs.caylax.repo.PriceRepo;
import com.marlabs.caylax.repo.ProductRepo;

@SpringBootApplication
public class ProductPriceSwaggerApplication implements CommandLineRunner {
	@Autowired
	private ProductRepo repo;
	@Autowired
	private PriceRepo repo1;
	
	@Bean
	public ModelMapper createMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductPriceSwaggerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Price pri=new Price();
		pri.setBaseAmount(112F);
		pri.setBasePoints(92L);
		pri.setDiscounAmount(10.05F);
		pri.setTaxAmount(222F);
		pri.setTotalAmount(2002F);
		repo1.save(pri);
		
		Product pro=new Product();
		pro.setId(1);
		pro.setEndDate("1999-10-09");
		pro.setProductSpecificId("AXN123");
		pro.setStartDate("2020-11-02");
		pro.setPrice(pri);
	    repo.save(pro);
		
	
	}

}
