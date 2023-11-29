package ex1;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
	
	private double raduis=1.0;
	private String color="green";
	
	public Circle()
	{
		
	}
	
	

	public Circle(double raduis) {
		
		this.raduis = raduis;
	}
	
	



	public Circle(double raduis, String color) {
		
		this.raduis = raduis;
		this.color = color;
	}
	
	



	public double getRaduis() {
		return raduis;
	}



	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}
	
	



	@Override
	public String toString() {
		return "Circle information => raduis=" + raduis + ", color=" + color ;
	}
	
	public double getArea()
	{
		return PI * pow(raduis,3);
	}



	public static void main(String[] args) {
		Circle c1 = new Circle(3.2,"jalo");
		c1.getArea();
		c1.toString();
		System.out.println("Area equal : "+c1.getArea());
		System.out.println(c1.toString());

	}

}
