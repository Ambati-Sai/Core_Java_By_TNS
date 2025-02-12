package com.tns.multithreading;

public class MainThread {
	public static void main(String[] args) {
		Eclipse e = new Eclipse();
		e.start();
		Chrome c = new Chrome();
		c.start();
		
	}

}
