public class Rhombus {

	//Data Attributes
	/**
	 * the private double resolves the side and diagonol to a variable
	 */
	private double diagonol;
	private double side;
	
	//constructor
	/**
	 * this method returns the value of a rhombus
	 * @param p = diagonol
	 * @param q = diagonol
	 * @param s = side
	 */
	public Rhombus(double p, double q, double s)
	{
		diagonol = p;
		diagonol = q;
		side = s;
	}
	
	//functionality
	/**
	 * This method returns the side of the rhombua
	 * @return value of side
	 */
	public double getSide()
	{
		return(side);
	}
	
	
	/**
	 * this method returns the diagonal of the rhombus
	 * @return value of diagonal
	 */
	public double getDiagonol()
	{
		return(diagonol);
	}
	
	
	/**
	 * this method returns the area of the rhombus
	 * @return value of area
	 */
	public double getArea()
	{
		return((diagonol*diagonol)/2);
	}
	
	
	/**
	 * this method returns the perimeter of the rhombus
	 * @return value of perimeter
	 */
	public double getPerimeter()
	{
		return(4*side);
	}
	
	
	/**
	 * this method returns the name of the shape
	 * @return name of shape
	 */
	public static String getShape()
	{
		return "Rhombus";
	}
}
