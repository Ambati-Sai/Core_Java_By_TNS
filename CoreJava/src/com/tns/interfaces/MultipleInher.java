package com.tns.interfaces;

public class MultipleInher implements ParentInterface,ParentTwoInterface{

	@Override
	public void print() {
		System.out.println(num1+num2);
		
	}

	@Override
	public void show() {
		System.out.println(num1-num2);
	
	}
	public static void main(String[] args) {
		MultipleInher mi = new MultipleInher();
		mi.print();
		mi.show();
		System.out.println(ParentTwoInterface.num1);
		System.out.println(ParentTwoInterface.num2);
		
	}

}
