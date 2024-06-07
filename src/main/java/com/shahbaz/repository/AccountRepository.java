package com.shahbaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahbaz.model.Account;

public interface AccountRepository extends JpaRepository<Account,Long>{

}
