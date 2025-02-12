package com.tns.multithreading;

public class Eclipse extends Thread {

	public void run() {
		System.out.println("eclipse"+Thread.currentThread().getId());
	}
}
		
