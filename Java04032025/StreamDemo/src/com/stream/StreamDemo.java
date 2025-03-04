package com.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Order{
	private
		int id;
		String name;
		int price;
		String month;
		int year;
		String city;
		String category;
		int qty;
	
	public Order(int id, String name, int price, String month, int year, String city, String category, int qty) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.month = month;
		this.year = year;
		this.city = city;
		this.category = category;
		this.qty = qty;
	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getPrice() {
		return price;
	}

//	public void setPrice(int price) {
//		this.price = price;
//	}

	public String getMonth() {
		return month;
	}

//	public void setMonth(String month) {
//		this.month = month;
//	}

	public int getYear() {
		return year;
	}

//	public void setYear(int year) {
//		this.year = year;
//	}

	public String getCity() {
		return city;
	}

//	public void setCity(String city) {
//		this.city = city;
//	}

	public String getCategory() {
		return category;
	}

//	public void setCategory(String category) {
//		this.category = category;
//	}

	public int getQty() {
		return qty;
	}

//	public void setQty(int qty) {
//		this.qty = qty;
//	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", price=" + price + ", month=" + month + ", year=" + year
				+ ", city=" + city + ", category=" + category + ", qty=" + qty + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, city, id, month, name, price, qty, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(category, other.category) && Objects.equals(city, other.city) && id == other.id
				&& Objects.equals(month, other.month) && Objects.equals(name, other.name) && price == other.price
				&& qty == other.qty && year == other.year;
	}
	
	
}

public class StreamDemo {
		
//		1. Heighest order in the year
		
	public static void getYearWithHeighestOrders(List<Order> orderList) {
		
	}
		
//		2. Category wise order
		
	public static void getCategoryWiseOrders(List<Order> orderList) {
		
	}
		
//		3. Max price of orders
		
	public static void getMaxPrice(List<Order> orderList) {
		
	}
		
//		4. Avg monthly spending
		
	public static void getAvgMonthlySpending(List<Order> orderList) {
		
	}
		
//		5. Min order price
		
	public static void getMinOrderPrice(List<Order> orderList) {
		
	}
		
//		6. First order of customer
	
	public static void getFirstOrderOfTheCustomer(List<Order> orderList) {
		
	}
	
	
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
				new Order(1050,"RMX3031", 24800,"Aug",2021,"Kolkata","SmartPhone",1),
				new Order(1051,"X412DA", 40990,"Sept",2021,"Howrah","Laptop",1),
				new Order(1052,"F23 5G", 15690,"Oct",2021,"North24Pargana","SmartPhone",1),
				new Order(1053,"Jeans", 1899,"Oct",2021,"Kolkata","Garments",2),
				new Order(1054,"Almond500", 650,"Oct",2021,"Hoghly","Food",2),
				new Order(1055,"NCT645B", 11800,"Nov",2021,"Howrah","Appliance",1),
				new Order(1085,"WL325L", 28800,"Dec",2021,"Kolkata","Apliance",1),
				new Order(1065,"Lays", 20,"Dec",2021,"Howrah","Food",5),
				new Order(1092,"IQOO Z9x", 13990,"Jan",2022,"Kolkata","SmartPhone",1),
				new Order(1093,"Kurta", 2999,"Feb",2022,"Hooghly","Garments",1)
				);
	}
}
