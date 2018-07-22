package com.yazici.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="USER")
@Data
public class User {
	
	@Id
	@Column(name="USER_ID")
	private Long userId;
	
	@Column(name="USERNAME",nullable=false,unique=true)
	private String username;
	
	@Column(name="PASSWORD")
	private String password;


	

	
}
