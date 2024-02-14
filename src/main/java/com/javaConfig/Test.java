package com.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/javaConfig/config.xml");

		// AnnotationConfigApplicationContext used to cofiguration using java class
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//Student student = context.getBean("firstStudent",Student.class);
		Student student = context.getBean("getStudent",Student.class);
		System.out.println(student);
		student.study();
	}

}
