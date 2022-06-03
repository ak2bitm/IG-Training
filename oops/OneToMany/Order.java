package com.akhilesh.OneToMany;

public class Order {

	private int orderId;
	private String name;
	Customer customer;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", customer=" + customer + "]";
	}
	
}
