package com.skan.restomanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skan.restomanager.domain.Recette;

public interface IRecetteDao extends JpaRepository<Recette, Long> {
	
	Recette findByName(String name);
	
	Recette findByDuration(int duration);

}
