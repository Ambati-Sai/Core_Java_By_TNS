package com.tns.collection;

import java.util.ArrayList;

public interface Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(8);
		al.add(9);
		al.add(4);
		al.add(20);
		System.out.println("size" +al.size());
		System.out.println(al);
		System.out.println(al.contains(2));
		System.out.println(al.remove(0));
		System.out.println(al);
	}

}
