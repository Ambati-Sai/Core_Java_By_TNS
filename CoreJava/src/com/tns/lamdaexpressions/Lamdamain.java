package com.tns.lamdaexpressions;

public class Lamdamain {
	public static void main(String[] args) {
		Interfacedemo id = (a)-> {System.out.println("Square of a number:"+(a*a));};
		id.show(2);
	}	

}
