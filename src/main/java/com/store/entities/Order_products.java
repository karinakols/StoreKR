package com.store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@NoArgsConstructor
@AllArgsConstructor
@Data
@IdClass(Order_productsId.class)
@Entity
@Table(name="order_products")
public class Order_products {
	
	@Id
	@OneToOne
	@JoinColumn(name="order_id",nullable = false)
	private Order order;
	
	
	@Id
	@OneToOne
	@JoinColumn(name="product_id",nullable = false )
	private Product product;
	
	@Id
	@OneToOne
	@JoinColumn(name="size_id",nullable = false)
	private Size size;
	
	
	
	@Column(name="price",nullable = false)
	private double price;
	
	@Column(name="discount",nullable = false)
	private double discount;
	
	@Column(name="quantity",nullable = false)
	private int quantity;
	

}
