package com.skan.restomanager.service;

import java.util.List;
import java.util.Optional;

import com.skan.restomanager.domain.User;

public interface IUserService {
	
	Optional<User> findById(long id);
	
	User findByEmail(String email);
	
	User findByUsername(String username);
	
	List<User> findByActive(boolean isActive);
	
	User save(User user);
	
	User update(User user);
	
	void delete(User user);
	
	void deleteById(long id);


}
