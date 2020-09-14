package com.assignment.q1;

import java.util.Scanner;

class Circle {
	private double radius;
	private String color;
	public Circle(int radius, String color)
	{
		this.radius=radius;
		this.color=color;
	}
	public Circle() {
		
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color= color;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}
public class CircleDetails {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Radius: ");
		double radius= s.nextDouble();
		Circle circle=new Circle(radius, "red");
		System.out.println("Radius of circle: "+circle.getRadius());
		System.out.println("Area of circle: "+String.format("%.2f",circle.getArea()));

	}

}
