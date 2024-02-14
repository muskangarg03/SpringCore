package com.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowiring/annotation/autoconfig.xml");
		//Employee emp1 =(Employee)context.getBean("emp1");
		Employee emp1 = context.getBean("emp1",Employee.class); //no need of type-casting
		System.out.println(emp1);
		
	}

}
