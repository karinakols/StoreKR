package com.store.entities;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name="id")
//	@GenericGenerator(name="generator")
	@GeneratedValue(generator ="generator", strategy = GenerationType.AUTO)
	private String id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="birth_date")
	@CreatedDate
	private Date birth_date;
	
	@Column(name="password_hash_code")
	private String password_hash_code;
	
	@Column(name="activation_date")
	@CreatedDate
	private Date activation_date;
	
	@Column(name="revoked")
	private String revoked;
	
	
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Profile profile;

}
