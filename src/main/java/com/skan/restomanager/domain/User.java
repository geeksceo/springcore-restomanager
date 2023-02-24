package com.skan.restomanager.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String username;
	
	@Column(unique = true)
	private String email;
	
	private String password;
	
	@Column(nullable = false)
	private boolean active;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="user_roles",
			joinColumns=@JoinColumn(name="user_id", referencedColumnName="id"),
			inverseJoinColumns=@JoinColumn(name="role_id", referencedColumnName="id"))
	private Set<Role> roles = new HashSet<>();
	
	protected User() {}
	
	public User(String username, String email) {
		this.username = username;
		this.email = email;
	}
	
	public User(String username, String email, String password) {
		this(username, email);
		this.password = password;
	}
	
	public User(String username, String email, String password, boolean active) {
		this(username, email, password);
		this.active = active;
	}
	
	@Override
	public String toString() {
		return String.format(
			"Utilisateur[username: @%s, e-mail: <%s>]",
	        this.getUsername(), this.getEmail());
	}

	public void addRole(Role role) {
		// ADD NEW ROLE TO EXISTING USER'S ROLES
	}

	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Role> getRoles() {
		return null;
	}
}
