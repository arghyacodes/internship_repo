package com.dthree;

class Student{
	public
		int id;
		String name;
		Student(){
			System.out.println("Student Created");
		}
		
		void getInfo() {
			System.out.println("Id : "+id+" Name : "+name);
		}
}
class Scholar extends Student{
	public
		String major;
		Scholar(){
			System.out.println("Scholar Created");
		}
		void getInfo() {
			System.out.println("Id : "+id+" Name : "+name+" Major in : "+major);
		}
}

class Teacher extends Scholar{
	public
		int salary;
		Teacher(){
			System.out.println("Teacher Created");
		}
		void getInfo() {
			System.out.println("Id : "+id+" Name : "+name+" Major in : "+major+" Salary : "+salary);
		}
}

public class MultiLevelDemo{
	public static void main(String[] args)
	{
		Teacher obj = new Teacher();
		obj.id = 1005;
		obj.name = "Ram";
		obj.major = "IoT";
		obj.salary = 100000;
		
		obj.getInfo();
	}
}