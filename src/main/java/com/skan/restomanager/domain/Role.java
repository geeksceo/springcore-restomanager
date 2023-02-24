package com.skan.restomanager.domain;

import java.util.List;

import com.skan.restomanager.constants.Profile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Enumerated(EnumType.STRING)
	@Column(unique=true)
	private Profile profile;
	
	@ManyToMany(mappedBy = "roles")
	private List<User> users;
	
	protected Role(){}
	
	public Role(Profile profile) {
		this.profile = profile;
	}
	
	public long getId() {
		return this.id;
	}
	
	public Profile getProfile() {
		return this.profile;
	}
	
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
