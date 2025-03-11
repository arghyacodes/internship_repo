package com.test;

public class Employee {
	private
		int id;
		String name;
		String cmp;
		String city;
		
	public Employee() {
		
	}
	
	public Employee(int id, String name, String cmp, String city) {
		this.id = id;
		this.name =name;
		this.cmp=cmp;
		this.city=city;
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
		public String getCmp() {
			return cmp;
		}
		public void setCmp(String cmp) {
			this.cmp = cmp;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", cmp=" + cmp + ", city=" + city + "]";
		}
		
	
}
