package Graphics;

import java.util.List;
import java.util.ArrayList;

public class ShapesFactory 
{
	
	public ShapesFactory() {}

	ArrayList<Shape> sList = new ArrayList<>();
	
	
	public void addShape(Shape s)
	{
		sList.add(s);
		System.out.println("Sucessfully Inserted");
	}
	
	public List<Circle> getCircles()
	{
		List<Circle> cList = null;
		int i =0;
		for(Shape s : sList)
		{
			if(s instanceof Circle)
			{
				i = i +1;
				//cList.add(s)
			}			
		}
		System.out.println("There are :"+ i+" Circles!");
		return cList;
	}
	
	public List<Rectangle> getRectangles()
	{
		List<Rectangle> rList = null;
		int j = 0;
		for(Shape s : sList)
		{
			if(s instanceof Circle)
			{
				j = j +1;
				//rList.add(s);
			}			
		}
		System.out.println("There are :"+ j+" Rectangles!");
		return rList;
	}
	
	public boolean deleteShape(Shape s)
	{
		if(sList.remove(s))
		{
			System.out.println("Deleted!");
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
