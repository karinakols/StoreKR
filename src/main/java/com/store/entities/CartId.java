package com.store.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartId implements Serializable{
	
   private User user_id;
	
	private Size size_id;
		
	private Product product_id;
	

}
