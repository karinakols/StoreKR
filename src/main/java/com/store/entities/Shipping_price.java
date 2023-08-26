package com.store.entities;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="shipping_price")
public class Shipping_price {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(name="starts_from",nullable = false, updatable = false)
	@CreatedDate
	private Date starts_from;
	
	@JoinColumn(name="shipping_method")
	@Enumerated(EnumType.STRING)
	private Shipping_method sh_method;
	
	@Column(name="price")
	private double price;

}
