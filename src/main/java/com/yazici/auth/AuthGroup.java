package com.yazici.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="AUTH_USER_GROUP")
@Data
public class AuthGroup {
	
	@Id
	@Column(name="AUTH_USER_GROUP_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="AUTH_GROUP")
	private String authGroup;
	
}
