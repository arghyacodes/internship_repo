package com.dthree;

class Parent{
	void getNum() {
		System.out.println("*#$^(%^()^");
	}
}

class Child extends Parent{
	void getNum() {
		System.out.println("*^#&*&$(%*");
	}
}

public class PolyOverriding{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.getNum();
	}
}