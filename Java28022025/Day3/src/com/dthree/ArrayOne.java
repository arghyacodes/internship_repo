package com.dthree;

class Students{
	private
		int id;
		String name;
		String city;
		
	public Students() {
		
	}
		
	public Students(int id, String name, String city)
		{
			this.id = id;
			this.name = name;
			this.city = city;
		}
		
	public
		void setId(int id) {
			this.id = id;
		}
		
		void setName(String name) {
			this.name = name;
		}
		
		void setCity(String city)
		{
			this.city = city;
		}
		int getId() {
			return id;
		}
		String getName() {
			return name;
		}
		String getCity() {
			return city;
		}
}

public class ArrayOne {
	public static void main(String[] args) {
		Students obj1 = new Students();
		obj1.setId(1006);
		obj1.setName("Arghya");
		obj1.setCity("Kolkata");
		
		Students obj2 = new Students(1005, "Rupankar", "Dumdum");
		
		Students[] sampleArray = {obj1, obj2};
		
		System.out.println(sampleArray[1].getName());
		System.out.println(sampleArray[0].getCity());
	}
}
