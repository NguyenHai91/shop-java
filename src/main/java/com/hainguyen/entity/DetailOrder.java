package com.hainguyen.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "DetailOrder")
public class DetailOrder {
	@EmbeddedId
	DetailOrderId detail_order_id;
	
	int quantity;
	float amount;
	public DetailOrderId getDetailOrderId() {
		return detail_order_id;
	}
	public void setDetailOrderId(DetailOrderId detailOrderId) {
		this.detail_order_id = detailOrderId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
}
