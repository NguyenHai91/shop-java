package com.hainguyen.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DetailOrderId implements Serializable {

	int id_order;
	int id_detail_order;
	
	public int getIdOrder() {
		return id_order;
	}
	public void setIdOrder(int idOrder) {
		this.id_order = idOrder;
	}
	public int getIdDetailOrder() {
		return id_detail_order;
	}
	public void setIdDetailOrder(int idDetailOrder) {
		this.id_detail_order = idDetailOrder;
	}
}
