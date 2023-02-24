package com.skan.restomanager.service;

import org.springframework.stereotype.Service;

import com.skan.restomanager.dao.IRecetteDao;
import com.skan.restomanager.domain.Recette;

@Service
public class RecetteService implements IRecetteService {

	private IRecetteDao recetteDao;
	
	public RecetteService(IRecetteDao recetteDao) {
		this.recetteDao = recetteDao;
	}
	
	@Override
	public Recette findByName(String name) {
		return this.recetteDao.findByName(name);
	}

	@Override
	public Recette findByDuration(int duration) {
		return this.recetteDao.findByDuration(duration);
	}

	@Override
	public Recette save(Recette recette) {
		return this.recetteDao.save(recette);
	}

	
	
}
