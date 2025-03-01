package com.exception;

public class ExceptionOne {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		
		try {
			System.out.println(10/5);
		}
		catch(ArithmeticException ae) {
			System.out.println("Don't divide by zero");
		}
		
		System.out.println("Java");
		
		
		int[] arr = {10,20,30,40};
		try {
			System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException ie) {
			System.out.println("Location doesn't exists, check your array size");
		}
		
		
		String str = "Java";
		try {
			System.out.println(str.charAt(2));
			System.out.println("End");
		}
		catch(Exception e) {
			System.out.println("Check inputs and try again");
		}
		
		finally {
			//always executed
			System.out.println("Finally Block Runs");
		}
	}
}
