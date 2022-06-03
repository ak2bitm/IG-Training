package com.akhilesh.OneToOne;

public class CustomerAddressMain {

	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.setCname("Ram");
		cust.setEmail("ram@gmail.com");
		cust.setPhone(1234);
		Address add = new Address();
		add.setState("up");
		add.setCity("vns");
		add.setPin(221002);
		cust.setAddress(add);
		System.out.println("Customer Name :"+cust.getCname());
		System.out.println("Customer Email :"+cust.getEmail());
		System.out.println("Customer Phone :"+cust.getPhone());
		System.out.println("Customer Address :"+cust.getAddress().getState()+" "+
		cust.getAddress().getCity()+" "+cust.getAddress().getPin());
	}
}
