package Graphics;

public class Executor 
{

	public static void main(String[] args) 
	{
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(3);
		Circle c3 = new Circle(4);
		System.out.println("---------------------------------------");
		System.out.println("Area of Circle :"+c1.area());
		
		Rectangle r1 = new Rectangle(3,3);
		Rectangle r2 = new Rectangle(2,1);
		Rectangle r3 = new Rectangle(4,5);
		System.out.println("Area of Rectangle: "+r1.area());
		
		System.out.println("---------------------------------------");
		
		ShapesFactory sf = new ShapesFactory();
		sf.addShape(c1);
		sf.addShape(c2);
		sf.addShape(c3);
		sf.addShape(r1);
		sf.addShape(r2);	
		sf.addShape(r3);	

		System.out.println("---------------------------------------");
		
		System.out.println(sf.getCircles());
		System.out.println(sf.getRectangles());
		System.out.println(sf.deleteShape(r1));
		
		System.out.println("---------------------------------------");
	}

}
