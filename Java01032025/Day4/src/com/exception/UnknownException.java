package com.exception;

public class UnknownException {
	try {
		System.out.println(300/0);
	}
	catch(Exception e) {
		System.out.println(e.getMessage()); //it will give only exception message
		
		System.out.println(e);	//using exception class object it will give exception class name and message
		
//		using printstack
		e.printStackTrace();
	}
}
