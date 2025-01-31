package com.tns.constructor;

public class Customer {
	Customer(){
		System.out.println("Customer detailes");
	}
	Customer(int id,String name){
		System.out.println("Customer Id:"+id + "  Customer name:"+name);
		
	}
	public static void main(String[] args) {
		Customer c= new Customer();
		Customer c2= new Customer(2,"sai");
		
	}

}
