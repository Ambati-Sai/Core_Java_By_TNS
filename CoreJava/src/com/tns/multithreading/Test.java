package com.tns.multithreading;

public class Test extends Thread{
	Example e;
	Test(Example e){
		this.e=e;
	}
	public void run() {
		Example.display();
	}

}
