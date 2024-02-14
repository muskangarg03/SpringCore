package com.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.javaConfig")
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	
//	@Bean   //it will an object of Student type to the IOC Container
	@Bean(name = {"student", "temp", "con"})
	public Student getStudent() {     //getStudent will be the name of bean name 
		//creating a new student object
		Student student = new Student(getSamosa());
		return student;
	}

}
