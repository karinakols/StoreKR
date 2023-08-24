package com.store.entities;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="profile")
public class Profile {
	 @Id
	 @Column(name="user_id")
//	 @GenericGenerator(name="generator")
	 @GeneratedValue(generator = "generator" ,strategy  = GenerationType.AUTO)
	 private String id;
	 
	 @Column
	 private String firt_name;
	 
	 @Column
	 private String second_name;
	
	 @Column
	 private String address;
	 
	 @Column
	 private String country;
	 
	 @Column
	 private String phone;
	 
	

	 @OneToOne 
	 @MapsId
	 @JoinColumn(name="user_id")
	 private User user;
	 

}
