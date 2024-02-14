package com.autowiring.xml;

public class Employee {
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setting method..");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside contructor..");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	

}
