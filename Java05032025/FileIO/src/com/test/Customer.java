package com.test;

public class Customer {
	private
		int id;
		String name;
		int pinCode;
		
	public Customer() {
		this.id = id;
		this.name = name;
		this.pinCode = pinCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", pinCode=" + pinCode + "]";
	}
	
	
}
