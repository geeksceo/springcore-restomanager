package com.skan.restomanager.domain;

import com.skan.restomanager.constants.Unit;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recettes")
public class Recette {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private int duration;
	
	@Enumerated(EnumType.STRING)
	private Unit unit;

	protected Recette() {}
	
	public Recette(String name) {
		this.name = name;
	}
	
	public Recette(String name, int duration) {
		this(name);
		this.duration = duration;
	}
	
	public Recette(String name, int duration, Unit unit) {
		this(name, duration);
		this.unit = unit;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
}
