package com.yazici.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.yazici.auth.User;

@Entity
@Table(name="COMMENT")
public class Comment {

	@Id
	@Column(name="COMMENT_ID")
	private Long id;
	
	@Column(name="TEXT")
	private String commentText;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_ID")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "POST_ID")
	private Post post;
	
	
}
