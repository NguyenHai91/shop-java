package com.hainguyen.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "Order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name_customer;
	String phone;
	String address;
	Boolean status;
	String date_create;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	Set<DetailProduct> listDetailProduct;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameCustomer() {
		return name_customer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.name_customer = nameCustomer;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getDateCreated() {
		return date_create;
	}

	public void setDateCreated(String dateCreated) {
		this.date_create = dateCreated;
	}

	public Set<DetailProduct> getListDetailProduct() {
		return listDetailProduct;
	}

	public void setListDetailProduct(Set<DetailProduct> listDetailProduct) {
		this.listDetailProduct = listDetailProduct;
	}
	
	
}
