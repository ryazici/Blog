package com.yazici.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yazici.entity.Post;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
	
}
