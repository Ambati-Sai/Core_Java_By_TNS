package com.tns.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraydemo {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("apple");
		s.add("abc");
		
	Iterator it = s.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}
	}

}
