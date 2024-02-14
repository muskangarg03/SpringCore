package com.springSpel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springSpel/spelconfig.xml");
		Demo d1 = context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		
		
		//spel can also be used with the help of SpelExpressionParser class
//		SpelExpressionParser temp = new SpelExpressionParser();
//		Expression expression = temp.parseExpression("22+44");  // here value can be passed directly, no need of #{}.
//		System.out.println(expression.getValue());
		
		
		
	}

}
