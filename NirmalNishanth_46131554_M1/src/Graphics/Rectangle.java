package Graphics;

public class Rectangle extends Shape 
{	
	private double length, breadth;
	
	public Rectangle() {}
	public Rectangle(double length, double breadth)
	{
		this.breadth = breadth;
		this.length = length;
	}
	
	double area() 
	{
		return length * breadth;
	}

}
