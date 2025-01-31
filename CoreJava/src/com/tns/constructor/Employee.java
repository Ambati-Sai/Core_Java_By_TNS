package com.tns.constructor;

public class Employee {
	private int Id;
	private String name;
	private int Salary;
	public Employee(int id, String name, int salary) {
	
		this.Id = id;
		this.name = name;
		this.Salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	


}
