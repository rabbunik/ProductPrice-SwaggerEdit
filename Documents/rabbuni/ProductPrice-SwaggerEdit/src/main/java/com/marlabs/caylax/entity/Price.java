package com.marlabs.caylax.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer priceId;
	private float totalAmount;
	private float baseAmount;
	private Long basePoints;
	private float taxAmount;
	private float discounAmount;
}
