package com.tns.multithreading;

public class Amazon extends Thread {
	public void run() {
		for(int i= 0;i<5;i++);
		System.out.println("Amazon"+Thread.currentThread().getId());
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Amazon az = new Amazon();
		az.start();
	}

}

