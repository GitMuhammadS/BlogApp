package com.shahbaz.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
@Table(name="POST_TAB")
public class Post {
	@Id
	@GeneratedValue
	@Column(name="POST_ID")
	private Long id;
	
	@Column(name="POST_TITLE")
	private String title;
	
	@Column(name="POST_BODY")
	private String body;
	
	@Column(name="POST_CREATED")
	private LocalDateTime createdAt;
	
	@Column(name="POST_UPDATED")
	private LocalDateTime updatedAt;
}
