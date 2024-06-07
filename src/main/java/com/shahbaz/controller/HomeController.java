package com.shahbaz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shahbaz.model.Post;
import com.shahbaz.service.IPostService;

@Controller
public class HomeController {
	@Autowired
	private IPostService postService;
	
	@GetMapping("/")
	public String home(Model model) {
		List<Post> posts=postService.getAllPost();
		model.addAttribute("posts", posts);
		return "home";
	}
}
