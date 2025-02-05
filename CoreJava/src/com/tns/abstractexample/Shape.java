package com.tns.abstractexample;

public abstract class Shape {
	protected float area;
	abstract void calarea();
	void show() {
		System.out.println("ares of shape:"+area);
	}
	@Override
	public String toString() {
		return "Shape [area=" + area + "]";
	}
	

}
