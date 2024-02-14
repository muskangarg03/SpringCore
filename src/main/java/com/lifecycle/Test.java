package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/lcconfig.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/lcconfig.xml");
		Samosa s1 = (Samosa)context.getBean("s1");
		System.out.println(s1);
		
		//AbstractApplicationContext will provide the registerShutdownHook() method
		// This ShutdownHook() method will execute the destroy method.
		context.registerShutdownHook();
		
		
		System.out.println("=====================================");
		Pepsi p1 = (Pepsi)context.getBean("p1");
		System.out.println(p1);
		
		
		System.out.println("--------------------------------------");
		Kurkure k1 = (Kurkure)context.getBean("k1");
		System.out.println(k1);
	
	
	}

}
