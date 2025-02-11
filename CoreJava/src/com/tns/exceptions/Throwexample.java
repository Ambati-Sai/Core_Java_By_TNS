package com.tns.exceptions;

public class Throwexample {
	private int age;
	public Throwexample(int age) {
		super();
		this.age = age;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void Show() {
		try {
			if(age<18) {
			throw new ArithmeticException("yor are noe eligible");
		}
			else {
				System.out.println("eligible");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}	
		
	}

