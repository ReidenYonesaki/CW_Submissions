public class Square {


	//Data Attributes
	/**
	 * the private double resolves the side to a variable
	 */
	private double side;
	
	//Constructor
	/**
	 * this method returns the value of a square
	 * @param s = side
	 */
	public Square(double s)
	{
		side = s;
	}
	
	//Functionality
	/**
	 * this method returns the side of the square
	 * @return value of side
	 */
	public double getSide()
	{
		return(side);
	}
	
	
	/**
	 * this method returns the perimeter of the square
	 * @return value of perimeter
	 */
	public double getPerimeter()
	{
		return(4*side);
	}
	
	
	/**
	 * this method returns the area of the square 
	 * @return value of area
	 */
	public double getArea()
	{
		return(side*side);
	}
	
	
	/**
	 * this method returns the name of the shape
	 * @return name of shape
	 */
	public static String getShape()
	{
		return "Square";
	}

	public void setSide(double side) {
		this.side = side;
	}
}
