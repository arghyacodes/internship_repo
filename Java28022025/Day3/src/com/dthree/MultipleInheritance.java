package com.dthree;

interface Person{
	public
		String name ="Ram";
		int age = 20;
}

interface Employee{
	public
		int empId = 1009;
		int salary = 20000;
}

interface Professor extends Person , Employee{
	
}

class Master implements Professor, Employee, Person{
	public void getInfo() {
		System.out.println("Name : "+name+" age : "+age+" employee id : "+empId+" salary : "+salary);
	}
}

public class MultipleInheritance{
	public static void main(String[] args) {
		Master m1 = new Master();
//		m1.name = "Ram";	//not possible
		m1.getInfo();
}
}