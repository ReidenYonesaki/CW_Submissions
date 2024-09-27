public class Rectangle {

	//Data Attributes
	/**
	 * the private double resolves the length and width to a variable
	 */
	private double length;
	private double width;
	
	
	//Constructor
	/**
	 * this returns the value of the rectangle
	 * @param l = length
	 * @param w = width
	 */
	public Rectangle(double l, double w)
	{
		length=l;
		width=w;
	}
	
	
	//Functionality
	/**
	 * this returns the length of the rectangle
	 * @return value of length
	 */
	public double getL()
	{
		return(length);
	}
	
	
	/**
	 * this returns the width of the rectangle
	 * @return value of width
	 */
	public double getW()
	{
		return(width);
	}
	 
	
	/**
	 * this returns the area of the rectangle
	 * @return value of area
	 */
	public double getArea()
	{
		return(length*width);
	}
	
	
	/**
	 * this returns the perimeter of the rectangle
	 * @return value of perimeter
	 */
	public double getPerimeter()
	{
		return(2*(length*width));
	}
	
	
	/**
	 * this returns the name of shape
	 * @return name of shape
	 */
	public static String getShape()
	{
		return "Rectangle";
	}
		
	
	public String toString()
	{
		return "this is a rectangle with a perimeter of " + getPerimeter() + " and and area of " + getArea();
	}	
}
