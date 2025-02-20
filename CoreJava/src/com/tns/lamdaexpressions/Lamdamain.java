package com.tns.lamdaexpressions;

public class Lamdamain {
	public static void main(String[] args) {
		Interfacedemo id = (a)-> {return a*a;};
		System.out.println("Square of a number:"+id.show(2));
	}	

}
