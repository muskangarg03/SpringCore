package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Using Annotation
public class Kurkure {
	
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Kurkure() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Kurkure [company=" + company + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method : init");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending method : destroy");
	}

}
