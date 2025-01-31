package com.tns.constructor;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter your id:");
		int Id = Sc.nextInt();
		System.out.println("Enter your name:");
		String name = Sc.next();
		System.out.println("enter your salary:");
		int Salary = Sc.nextInt();
		Employee em = new Employee(Id,name,Salary);
		em.setId(Id);
		em.setName(name);
		em.setSalary(Salary);
		System.out.println(em);
		
		
	}
	

}
