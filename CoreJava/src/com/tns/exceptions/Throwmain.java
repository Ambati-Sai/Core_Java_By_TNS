package com.tns.exceptions;

import java.util.Scanner;

public class Throwmain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = s.nextInt();
	
		Throwexample obj = new Throwexample(age);
		obj.setAge(age);
		obj.Show();

}
}
