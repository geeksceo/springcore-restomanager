package com.skan.restomanager.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.skan.restomanager.dao.IRoleDao;
import com.skan.restomanager.domain.Role;

@Service
public class RoleService implements IRoleService {

	private final IRoleDao roleDao;
	
	public RoleService(IRoleDao roleDao) {
		this.roleDao = roleDao;
	}
	
	@Override
	public Optional<Role> findById(long id) {
		return this.roleDao.findById(id);			
	}

	@Override
	public Role save(Role role) {
		return this.roleDao.save(role);
	}


}
