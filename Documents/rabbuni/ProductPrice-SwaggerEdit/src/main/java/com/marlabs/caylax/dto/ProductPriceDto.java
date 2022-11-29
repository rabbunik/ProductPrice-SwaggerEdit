package com.marlabs.caylax.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;
@Data
public class ProductPriceDto {
	private Integer id;
	@JsonFormat(pattern="yyyy-MM-DD",shape=Shape.STRING)
	private String startDate;
	@JsonFormat(pattern="yyyy-MM-DD",shape=Shape.STRING)
	private String endDate;
	private String productSpecificId;
	private float totalAmount;
	private float baseAmount;
	private Long basePoints;
	private float taxAmount;
	private float discounAmount;


}
