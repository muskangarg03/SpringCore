package com.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotypeAnnotation/stereoconfig.xml");
		Student student = context.getBean("student",Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass());

		
		//Bean Scope
		//By deafult, Bean Scope is Singelton
		System.out.println(student.hashCode());
		Student student2 = context.getBean("student",Student.class);
		System.out.println(student2.hashCode());
		
		System.out.println("--------------------------");
		
		Teacher t1 = context.getBean("teacher",Teacher.class);
		Teacher t2 = context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
	}

}
