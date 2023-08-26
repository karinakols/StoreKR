package com.store.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product_toBe_RatedId implements Serializable{
	
    private User user;
	
	private Product product;
	
	private Order order;

}
