package com.dthree;

interface FunInf5{
	String greetUser(int id, String name, String msg);
}

public class FunDemo {
	public static void main(String[] args) {
		FunInf5 obj = (int id, String name, String msg)->
		{
			System.out.println(id+" "+name+" "+msg);
			return "hi hello";
		};
		obj.greetUser(101,"Ram","Dev");
	}
}
