package com.shahbaz.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahbaz.model.Post;
import com.shahbaz.repository.PostRepository;

@Service
public class PostServiceImpl implements IPostService{
	@Autowired
	private PostRepository postRepo;

	@Override
	public Post savePost(Post post) {
		if(post.getId()==null) {
			post.setCreatedAt(LocalDateTime.now());
		}
		post.setUpdatedAt(LocalDateTime.now());
		return postRepo.save(post);
	}

	@Override
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return postRepo.findAll();
	}

	@Override
	public Optional<Post> getOnePost(Long id) {
		// TODO Auto-generated method stub
		return postRepo.findById(id);
	}

	@Override
	public void delete(Post post) {
		postRepo.delete(post);
		
	}
}
