package com.tns.abstractexample;

public class Square extends Shape {
	private float side;
	public Square() {
		side =2.5f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	@Override
	void calarea() {
		super.area=side*side;
		
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	public static void main(String[] args) {
		Shape s =new Square();
		s.calarea();
		s.show();
	}

}
