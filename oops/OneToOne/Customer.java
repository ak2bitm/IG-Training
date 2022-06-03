package com.akhilesh.OneToOne;

public class Customer {

	private String cname;
	private String email;
	private long phone;
	private Address address;
	public Customer() {}
	public Customer(String cname, String email, long phone, Address address) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", email=" + email + ", phone=" + phone + ", address=" + address + "]";
	}
	
}
