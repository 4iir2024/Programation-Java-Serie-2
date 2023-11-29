package ex1;

public class Rectangle {
	
	private float lenght=1.0f;
	private float width=1.0f;
	
	public Rectangle()
	{
		
	}
	
	

	public Rectangle(float lenght, float width) {
		
		this.lenght = lenght;
		this.width = width;
	}
	
	



	public float getLenght() {
		return lenght;
	}



	public void setLenght(float lenght) {
		this.lenght = lenght;
	}



	public float getWidth() {
		return width;
	}



	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea()
	{
		return lenght * width ;
	}
	
	public double getPerimeter()
	{
		return (lenght + width) * 2;
	}
	
	
	
	



	@Override
	public String toString() {
		return "Rectangle informations => lenght=" + lenght + ", width=" + width ;
	}



	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(1.2f,3.2f);
		r1.toString();
		r1.getArea();
		r1.getPerimeter();
		
		System.out.println(r1.toString());
		System.out.println("Area equal : "+r1.getArea());
		System.out.println("Perimeter equal : "+r1.getPerimeter());
		
		

	}

}
