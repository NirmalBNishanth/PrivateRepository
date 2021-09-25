package Graphics;

public class Circle extends Shape 
{
	private double radius;
	
	public Circle(){}
	public Circle(double radius) 
	{
		this.radius = radius;
	}
	double area() 
	{
		return 3.14 *radius *radius;
	}

}
