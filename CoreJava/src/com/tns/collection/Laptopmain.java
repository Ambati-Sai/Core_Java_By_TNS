package com.tns.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laptopmain {
	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell",50000,8));
		laps.add(new Laptop("HP",60000,16));
		laps.add(new Laptop("Apple",80000,32));
		Collections.sort(laps);
		for(Laptop i:laps) {
			System.out.println(i);
		}
	}

}
