package com.tns.multithreading;

public class SynMain {
	public static void main(String[] args) {
		Example eg = new Example();
		Test t1=new Test(eg);
		Test t2=new Test(eg);
		Test t3=new Test(eg);
		t1.start();
		t2.start();
		t3.start();
	}

}
