package com.skan.restomanager.dao;


import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.skan.restomanager.domain.User;
import jakarta.annotation.Nullable;


public interface IUserDao extends JpaRepository<User, Long> {
	
	@Nullable
	User findByEmail(String email);
	
	@Nullable
	User findByUsername(String username);
	
	@Nullable
	List<User> findByActive(boolean active);
	
}
