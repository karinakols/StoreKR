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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID )
	@Column(name="id",nullable = false)
	private UUID id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	@Column(name="date_created",nullable = false, updatable = false)
	@CreatedDate
	private Date date_created;
	
	@Column(name="date_delivered",nullable = false,updatable = false)
	private Date date_delivered;
	
	@Column(name="price",nullable = false)
	private double price;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status",nullable = false)
	private Status status;
	
	@Enumerated(EnumType.STRING)
	@Column(name="shipping_method",nullable = false)
	private Shipping_method shipping_method;
	
	@Enumerated(EnumType.STRING)
	@Column(name="payment_method",nullable = false)
	private Payment_method payment_method;
	

}
