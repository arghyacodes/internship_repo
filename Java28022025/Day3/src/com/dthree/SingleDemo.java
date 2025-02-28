package com.dthree;

class A{
	public
		int id;
		String name;
		
		void getInfo() {
			System.out.println("Id : "+id+" Name : "+name);
		}
}
class B extends A{
	public
		String city;
		void getInfo() {
			System.out.println("Id : "+id+" Name : "+name+" City : "+city);
		}
}

public class SingleDemo{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.id = 1005;
		obj.name = "Ram";
		obj.city = "Ajodhya";
		
		obj.getInfo();
	}
}