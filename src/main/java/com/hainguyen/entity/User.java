package com.hainguyen.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String address;
	String email;
	char password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	Role role;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getPassword() {
		return password;
	}

	public void setPassword(char password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setPermission(Role role) {
		this.role = role;
	}

	
	
	
}
