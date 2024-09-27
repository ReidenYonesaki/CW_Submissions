public class Triangle {

	//Data Attributes
	/**
	 * the private double resolves the side, height, and base to a variable
	 */
	private double side;
	private double height;
	private double base;
	
	//Constructor
	/**
	 * this method returns the value of the triangle
	 * @param s = side
	 * @param h = height
	 * @param b = base
	 */
	public Triangle(double s, double h, double b)
	{
		side = s;
		height = h;
		base = b;
	}
	
	
	//Functionality
	/**
	 * This method returns the side value of the triangle object.
	 * @return value of side
	 */
	public double getSide()
	{
		return(side);
	}
	
	/**
	 * This method returns the height of the triangle object
	 * @return value of height
	 */
	public double getHeight()
	{
		return(height);
	}
	
	/**
	 * This method returns the base of the triangle object
	 * @return value of base
	 */
	public double getBase()
	{
		return(base);
	}
	
	/**
	 * This method returns the area of the triangle
	 * @return value of the area
	 */
	public double getArea()
	{
		return((height*base)/2);
	}
	
	/**
	 * this method returns the perimeter of the triangle
	 * @return value of the perimeter
	 */
	public double getPerimeter()
	{
		return(side+side+side);
	}
	
	/**
	 * This method returns the name of the shape
	 * @return name of shape
	 */
	public static String getShape()
	{
		return "Triangle";
	}
}
