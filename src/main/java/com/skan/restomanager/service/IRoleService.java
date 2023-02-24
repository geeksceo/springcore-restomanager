package com.skan.restomanager.service;

import java.util.Optional;

import com.skan.restomanager.domain.Role;

public interface IRoleService {

	Optional<Role> findById(long id);
	
	Role save(Role role);
}
