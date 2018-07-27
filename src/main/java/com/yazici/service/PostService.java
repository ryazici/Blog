package com.yazici.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yazici.entity.Post;
import com.yazici.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	
	public List<Post> getPageItems(){
		
		 List<Post> items=new ArrayList<>();
		
		 postRepository.findAll().forEach(items::add);
		 return items;
	}
	
	public long getCount() {
		return postRepository.count();
	}
	
}
