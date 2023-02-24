package com.skan.restomanager.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Favoris {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	protected Favoris() {}
	
	public long getId() {
		return this.id;
	}
	
}
