package com.tns.exceptions;

public class Testhree {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae.getMessage());
		}
		finally {
			System.out.println("------------------------------");
		}
	}

}

