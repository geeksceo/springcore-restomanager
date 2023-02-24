package com.skan.restomanager.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skan.restomanager.constants.Profile;
import com.skan.restomanager.domain.Role;

public interface IRoleDao extends JpaRepository<Role, Long>{

	Optional<Role> findById(long id);
	
	Role findByProfile(Profile profile);
	
}
