package com.yazici.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yazici.entity.Post;
import com.yazici.repository.PostRepository;

@Controller
public class PostController {
	
	
	
	@Autowired
	private PostRepository postRepository;
	
	
	@GetMapping({"/","/index","/post"})
	  public String index(@RequestParam(value="page",required=false) Optional<Integer> pagePar,@RequestParam(value="size",required=false) Optional<Integer> sizePar, Model model){
		
		int page=pagePar.orElse(0);
		int size=sizePar.orElse(6);
		
		Pageable pageable=PageRequest.of(page, size);
		
		  Page<Post> posts = postRepository.findAll(PageRequest.of(pageable.getPageNumber(), pageable.getPageSize()));
		  
		  
		  
	      model.addAttribute("page", posts);
	      
	      return "index";
	  }
	
	
	
	@GetMapping("/post/{postId}")
	public ModelAndView getPost(@PathVariable("postId") String postId) {
	
		Post post=postRepository.findById(Long.parseLong(postId)).get();
		
		
		ModelAndView mav=new ModelAndView("post-detail");
		mav.addObject("post", post );
	
		
		return mav;
	}
	
	
	@PostMapping(value="/addpost")
	public String handleFormSubmit(@Valid Post post, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			return "admin";
		}
		postRepository.save(post);
		redirectAttributes.addFlashAttribute("message", "Post created with id :" + post.getId());
		return "redirect:/admin";
	}
	
	
}
