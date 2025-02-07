package com.tns.exceptions;

public class WitrhException {
	public static void main(String[] args) {
		int num = 10;
		try {
			int div = num/0;
		}
		catch(ArithmeticException e) {
			System.out.println("eception catch:" +e.getMessage());
		}
		
	}

}
