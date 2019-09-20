package com.hainguyen.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="DetailProduct")
public class DetailProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int quantity;
	String date_create;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	Product product;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	Size size;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	Color color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDateCreated() {
		return date_create;
	}
	public void setDateCreated(String dateCreated) {
		this.date_create = dateCreated;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
}



























