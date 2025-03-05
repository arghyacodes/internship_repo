package com.test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerialDemo {
 public static void main(String[] args) {
	Scanner sc = new Scanner(new BufferedInputStream(System.in));
	
	System.out.println("Enter id");
	int id = sc.nextInt();
	
	System.out.println("Enter name");
	String name = sc.next();
	
	System.out.println("Enter City");
	String city = sc.next();
	
	System.out.println("Enter pin code");
	int pinCode = sc.nextInt();
	
	Customer cstObj = new Customer(id, name, city, pinCode);
	
	FileOutputStream fout = null;
	Object BuferedOutputStream = null;
	ObjectOutputStream objout = null;
	
	System.out.println("Done");
	
	try {
		fout = new FileOutputStream("rc/customer.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		objout = new ObjectOutputStream(bout);
		objout.writeObject(cstObj);
	}
}
}
