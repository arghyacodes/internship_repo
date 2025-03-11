package com.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestData {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
//		With Default Constructor
		Employee obj = (Employee)ctx.getBean("emp");
		
		System.out.println(obj);
		
//		With Parameterised Constructor
		Employee obj1 = ctx.getBean("emp1", Employee.class);
		
		System.out.println(obj1);
	}
}
