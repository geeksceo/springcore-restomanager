package com.skan.restomanager.service;

import com.skan.restomanager.domain.Recette;

public interface IRecetteService {

	Recette findByName(String name);
	
	Recette findByDuration(int duration);
	
	Recette save(Recette recette);
	
}
