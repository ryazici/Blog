package com.yazici.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name="CATEGORY")
@Data
public class Category {
	
	@Id
	@Column(name="CATEGORY_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long categoryId;

	@Column(name="NAME")
	@NotNull
	private String name;
	
	
	 @OneToMany(mappedBy = "category", 
		        cascade = CascadeType.ALL, 
		        orphanRemoval = true)
	private List<Post> posts;
}
