package com.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/standaloneCollections/standaloneConfig.xml");
		
		Person person1 = con.getBean("person1",Person.class);
		System.out.println(person1.getFriends());
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println("-----------------------------------");
		System.out.println(person1.getFees());
		System.out.println(person1.getFees().getClass());
		System.out.println("-----------------------------------");
		System.out.println(person1.getProperties());;
		System.out.println(person1.getProperties().getClass());
	}

}
