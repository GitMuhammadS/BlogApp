package com.shahbaz.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name="ACCOUNT_TAB")
public class Account {
	
	@Id
	@GeneratedValue
	@Column(name="ACCOUNT_ID")
	private Long id;
	
	@Column(name="ACCOUNT_EMAIL")
	private String email;
	
	@Column(name="ACCOUNT_PASSWORD")
	private String password;
	
	@Column(name="ACCOUNT_FIRSTNAME")
	private String firstName;
	
	@Column(name="ACCOUNT_LASTNAME")
	private String lastName;
	
	@Column(name="ACCOUNT_CREATED")
	private LocalDateTime createdAt;
	
	@Column(name="ACCOUNT_UPDATED")
	private LocalDateTime updatedAt;
	
	@JsonIgnore
	@OneToMany
	List<Post> posts;
}
