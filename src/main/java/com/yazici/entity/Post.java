package com.yazici.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="POST")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

	@Id
	@Column(name="POST_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="postSeqGen")
	@SequenceGenerator(name="postSeqGen",sequenceName="post_sequence")
	private long id;
	
	@Column(name="TITLE", unique=true)
	private String title;
	
	@Column(name="CONTENT")
	private String content;
	
	@Column(name="DATE_CREATED")
	private Date dateCreated;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CATEGORY_ID")
	private Category category;
	

	@OneToMany(mappedBy = "post", 
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true)
	private List<Comment> comments;
	
}
