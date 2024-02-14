package com.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("temp")  //name of the bean through which you want to perform the injection
	private Address address;

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		System.out.println("setting method..");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
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
