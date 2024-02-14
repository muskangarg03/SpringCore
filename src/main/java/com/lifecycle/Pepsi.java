package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//Using Interface
public class Pepsi implements InitializingBean, DisposableBean{

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//this method will works as init() method
		System.out.println("Taking pepsi : init");
		
	}

	@Override
	public void destroy() throws Exception {
		//this method will work as destroy() method
		System.out.println("Pepsi finished : destroy");
		
	}
	
	
	
}
