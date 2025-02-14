package com.tns.strings;

public class Stringdemo {
	public static void main(String[] args) {
		String s1 ="Sai";
		String s2 =s1;
		String s3=s2;
		System.out.println("before modificartion");
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
		System.out.println("s3"+s3);
		
		s1 = "Ambati";
		System.out.println("After modification");
		System.out.println("s1"+s1);
		System.out.println("s2"+s2);
		System.out.println("s3"+s3);
	}

}
