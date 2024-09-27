public class Circle {
	//Data Attributes
	private final double pi = 3.14;
	private double radius;
	
	//Constructor
	public Circle(double r)
	{
		radius = r ;
	}
	
	//functionality
	public double getRadius()
	{
		return radius;
	}
	
	public double getDiameter()
	{
		return (radius*2);
	}
	
	public double getCircumference()
	{
		return (radius*2*pi);
	}
	public double getArea()
	{
		return (radius*radius*pi);
	}
	public static String getShape()
	{
		return "Circle";
		
	}
}

//static means it does not depend on specific object
