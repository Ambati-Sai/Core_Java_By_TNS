package com.tns.exceptions;

// no exception (Finally block)
public class Testone {
	public static void main(String[] args) {
		try {
			System.out.println("Welcom");
		}
		catch(Exception e){
			System.out.println("java");
		}
		finally {
			System.out.println("Program");
		}
	}

}
