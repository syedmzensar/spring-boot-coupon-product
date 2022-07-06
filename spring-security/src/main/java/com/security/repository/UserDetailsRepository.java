package com.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.entity.User;

public interface UserDetailsRepository extends JpaRepository<User, Integer> {

	List<User> findByUsername(String username);
}
