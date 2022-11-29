package com.marlabs.caylax.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@JsonFormat(pattern="yyyy-MM-DD",shape=Shape.STRING)
	private String startDate;
	@JsonFormat(pattern="yyyy-MM-DD",shape=Shape.STRING)
	private String endDate;
	private String productSpecificId;
	@ManyToOne(fetch=FetchType.EAGER, optional=false)
	@JoinColumn(name="priceId")
	private Price price;

}
