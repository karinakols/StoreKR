package com.store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(CartId.class)
@Table(name = "cart")
public class Cart {
	
	
	 @Id
	 @ManyToOne
	 @JoinColumn(name="size_id",nullable = false)
	 private Size size_id;
	 
	 @Column(name="quantity")
	 private int quantity;
	 
	 
	 @Id
	 @OneToOne 
	 @JoinColumn(name = "user_id",nullable = false)
	 private User user_id;
	

	 @Id
	 @ManyToOne
	 @JoinColumn(name = "product_id",nullable = false)
	 private Product product_id;
	

}
