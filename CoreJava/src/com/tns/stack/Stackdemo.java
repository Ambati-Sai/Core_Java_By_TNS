package com.tns.stack;

import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {
		Stack<Integer> ob = new Stack<Integer>();
		ob.push(1);
		ob.push(2);
		System.out.println("Stack Elements"+ob);
		System.out.println(ob.peek());
		if(ob.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
		System.out.println(ob.search(2));
	}

}
