package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Domains.User;

@Transactional
public interface UserRepository extends JpaRepository<User,Long>{

}
