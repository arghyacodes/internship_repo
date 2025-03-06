package com.test;

import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.BeforeClass;

public class CalculatorTest {
	Exp2 obj;
	static int x;
	static int y;
	
	@BeforeClass
	
	public static void beforeClass()
	{
		System.out.println("BEFORE ALL THE TEST CASES ONLY ONE TIME");
		x=10;
		y=50;
	}
	
	@AfterClass
	
	public static void afterClass()
	{
		System.out.println("AFTER ALL THE TEST CASES ONLY ONE TIME");
		x=0;
		y=0;
	}
	public void setUp() {
		System.out.println("execute every test method before execution");
	}
	public void setDown() {
		System.out.println("execute every test method after execution");
	}
}
