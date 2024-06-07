package com.shahbaz.service;

import java.util.List;
import java.util.Optional;

import com.shahbaz.model.Post;

public interface IPostService {
	
	public Post savePost(Post post);
	public List<Post> getAllPost();
	public Optional<Post> getOnePost(Long id);
	public void delete(Post post);
}
