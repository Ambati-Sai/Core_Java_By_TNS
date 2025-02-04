package com.tns.statick;

public class Student {
	int rollNo;
	String name;
	static String college = "TKR";
	static void change() {
		college="tkr";	
		}
	Student(int r, String n){
		rollNo=r;
		name=n;
	}
	void display() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(college);
		
	}
	public static void main(String[] args) {
		Student s = new Student(401,"Sai");
		s.display();
	}
}
