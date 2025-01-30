package com.tns.scanner;
import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
	     String name = Sc.nextLine();
	     System.out.println("Enter Your RollNo:");
	     int rollNo = Sc.nextInt();
	     System.out.println("Enter Your Branch:");
	     String branch = Sc.nextLine();
	}

}
