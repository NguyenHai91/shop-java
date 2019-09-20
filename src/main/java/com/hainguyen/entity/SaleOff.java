package com.hainguyen.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="SaleOff")
public class SaleOff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String date_begin;
	String date_end;
	String describe;
	String image;
	int sale;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "DetailSaleOff", joinColumns= {@JoinColumn(name="id", referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(name ="id", referencedColumnName = "id")})
	
	Set<Product> listProduct;
	
	
	public int getSale() {
		return sale;
	}
	public void setSaleOff(int sale) {
		this.sale = sale;
	}
	public Set<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(Set<Product> listProduct) {
		this.listProduct = listProduct;
	}
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
	public String getDate_begin() {
		return date_begin;
	}
	public void setDate_begin(String date_begin) {
		this.date_begin = date_begin;
	}
	public String getDate_end() {
		return date_end;
	}
	public void setDate_end(String date_end) {
		this.date_end = date_end;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	

}
