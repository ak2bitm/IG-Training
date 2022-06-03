package com.akhilesh.OneToMany;

public class OneToManyMain {

	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.setName("Ram");
		cust.setEmail("ram@gmail.com");
		Order o = new Order();
		o.setName("iPhone");
		o.setOrderId(1234);
		o.setCustomer(cust);
		System.out.println("Customer Name :"+cust.getName());
		System.out.println("Customer Email :"+cust.getEmail());
		System.out.println("Order Name :"+o.getName());
		System.out.println("Order Id :"+o.getOrderId());
	}
}
