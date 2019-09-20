package com.hainguyen.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="Category")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	char name;
	char image;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	Set<Product> listProduct;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public char getImage() {
		return image;
	}
	public void setImage(char image) {
		this.image = image;
	}
	public Set<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(Set<Product> listProduct) {
		this.listProduct = listProduct;
	}
	
}

























