package com.yazici.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="CATEGORY")
@Data
@RequiredArgsConstructor
public class Category {
	
	@Id
	@Column(name="CATEGORY_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="catSeqGen")
	@SequenceGenerator(name="catSeqGen",sequenceName="category_sequence")
	private long categoryId;

	@Column(name="NAME")
	@NotNull
	private String name;
	
	
	 @OneToMany(mappedBy = "category", 
		        cascade = CascadeType.ALL, 
		        orphanRemoval = true)
	private List<Post> posts;
}
