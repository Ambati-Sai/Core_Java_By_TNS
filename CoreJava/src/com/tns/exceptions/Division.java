package com.tns.exceptions;

public class Division {
	public static void divide() {
		int a=10,b=0, c;
		try {
			c=a/b;
			
		}
		catch(Exception e) {
			System.out.println("exception catch" +e);
		}
	}

}
