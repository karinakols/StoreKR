package com.store.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@IdClass(Product_toBe_RatedId.class)
@Table(name="product_toBe_Rated")
public class Product_toBe_Rated {
	
	@Id
	@OneToOne
	@JoinColumn(name="user_id",nullable = false)
	private User user;
	
	@Id
	@OneToOne
	@JoinColumn(name="product_id",nullable = false)
	private Product product;
	
	@Id
	@OneToOne
	@JoinColumn(name="order_id",nullable = false)
	private Order order;
	

}
