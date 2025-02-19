package com.tns.stack;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		TreeSet<Integer> t =new TreeSet<Integer>();
		t.add(12);
		t.add(20);
		t.add(30);
		System.out.println("Elements of treeset:"+t);
		Iterator<Integer> it = t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
