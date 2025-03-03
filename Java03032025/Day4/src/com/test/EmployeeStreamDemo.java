package com.test;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    int age;
    String gender;
    int yoj; // Year of Joining
    double salary;

    public Employee(int id, String name, int age, String gender, int yoj, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.yoj = yoj;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", yoj=" + yoj +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeStreamDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Aimayak", 23, "Male", 2018, 50000),
                new Employee(102, "Bhogoboti", 25, "Male", 2021, 60000),
                new Employee(103, "Chirgail", 28, "Male", 2019, 55000),
                new Employee(104, "Soham", 40, "Male", 2022, 65490),
                new Employee(105, "Adway", 25, "Male", 2023, 69990)
        );

        // 1. Print employees whose name starts with a specific character (e.g., 'A')
        char specificChar = 'A';
        System.out.println("Employees whose name starts with '" + specificChar + "':");
        employees.stream()
                .filter(emp -> emp.name.startsWith(String.valueOf(specificChar)))
                .forEach(System.out::println);

        // 2. Employees who joined after 2020
        System.out.println("\nEmployees who joined after 2020:");
        List<Employee> joinedAfter2020 = employees.stream()
                .filter(emp -> emp.yoj > 2020)
                .collect(Collectors.toList());

        joinedAfter2020.forEach(System.out::println);

        // 3. Employees who joined after 2020 in sorted order (based on yoj) and store in new list
        List<Employee> sortedJoinedAfter2020 = employees.stream()
                .filter(emp -> emp.yoj > 2020)
                .sorted(Comparator.comparingInt(emp -> emp.yoj))
                .collect(Collectors.toList());

        System.out.println("\nSorted Employees who joined after 2020:");
        sortedJoinedAfter2020.forEach(System.out::println);
    }
}
