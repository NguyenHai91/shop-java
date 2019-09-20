package com.hainguyen.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	long price;
	String describe;
	char image;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="category")
	Category category;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	Set<DetailProduct> detailProduct;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	Set<SaleOff> listSaleOff;
	
	public Set<SaleOff> getListSaleOff() {
		return listSaleOff;
	}
	public void setListSaleOff(Set<SaleOff> listSaleOff) {
		this.listSaleOff = listSaleOff;
	}
	public Set<DetailProduct> getDetailProduct() {
		return detailProduct;
	}
	public void setDetailProduct(Set<DetailProduct> detailProduct) {
		this.detailProduct = detailProduct;
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
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public char getImage() {
		return image;
	}
	public void setImage(char image) {
		this.image = image;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
