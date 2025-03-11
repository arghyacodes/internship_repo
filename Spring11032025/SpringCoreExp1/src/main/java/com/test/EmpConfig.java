package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfig {
	@Bean
	public static Employee getEmp1()
	{
		return new Employee();
	}
	
	@Bean
	public static Employee getEmp2()
	{
		return new Employee(1003,"Arpan", "Hitech","Belur");
	}
}
