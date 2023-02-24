package com.skan.restomanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.skan.restomanager.dao.IUserDao;
import com.skan.restomanager.domain.User;

@Service
public class UserService implements IUserService {

	private final IUserDao userDao;
	
	UserService(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Optional<User> findById(long id) {
		return this.userDao.findById(id);
	}
	
	@Override
	public User findByEmail(String email) {
		return this.userDao.findByEmail(email);
	}

	@Override
	public User findByUsername(String username) {
		return this.userDao.findByUsername(username);
	}

	@Override
	public List<User> findByActive(boolean isActive) {
		return this.userDao.findByActive(isActive);
	}

	@Override
	public User save(User user) {
		return this.userDao.save(user);
	}
	
	@Override
	public User update(User user) {
		return user;
	}
	
	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public void deleteById(long id) {
		this.userDao.deleteById(id);
	}
	
	
	
}
