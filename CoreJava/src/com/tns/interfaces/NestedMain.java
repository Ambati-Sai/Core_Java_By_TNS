package com.tns.interfaces;

public class NestedMain {
	public static void main(String[] args) {
		NestedInterface nf = new NestedInterface();
		nf.print();
		System.out.println(nf.area);
		System.out.println(NestedInterface.area);
	}

}
