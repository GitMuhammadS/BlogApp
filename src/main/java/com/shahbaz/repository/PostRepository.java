package com.shahbaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahbaz.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
