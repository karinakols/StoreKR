package com.store.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ProfileDTO {
	private String user_id;
	private String firt_name;
	private String second_name;
	private String address;
	private String country;
	private String phone;
	 

}
