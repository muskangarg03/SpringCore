package com.stereotypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("ob")   --> We can also explicitly give the name of the bean, otherwise it takes the name by using the camel-casing on Class name
@Component
//@Scope("prototype")  // defining the 'prototype' as a bean scope.
public class Student {

	@Value("Muskan")
	private String studentName;
	@Value("Agra")
	private String city;
	
	@Value("#{temp}")
	private List<String> address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
	
}
