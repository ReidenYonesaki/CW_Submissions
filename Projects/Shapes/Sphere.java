public class Sphere {

	//Data Attributes
	/**
	 * the private double resolves pi and radius to a variable
	 */
	private final double pi = 3.14;
	private double radius;
	
	//Constructor
	/**
	 * this method returns the value of the sphere
	 * @param r = radius
	 */
	public Sphere(double r)
	{
		radius=r;
	}
	
	//Functionality
	/**
	 * this method returns the radius value of the sphere
	 * @return value of radius
	 */
	public double getRadius()
	{
		return(2*radius);
	}
	
	
	/**
	 * this method returns the diameter value of the sphere
	 * @return value of diameter
	 */
	public double getDiameter()
	{
		return(2*radius);
	}
	
	
	/**
	 * this method returns the circumference vaalue of the sphere
	 * @return value of circumference
	 */
	public double getCircumference()
	{
		return(2*pi*radius);
	}
	
	
	/**
	 * this method returns the surface area of the sphere
	 * @return value of surface area
	 */
	public double getSurfaceArea()
	{
		return(4*pi*radius*radius);
	}
		
	
	/**
	 * this method returns the volume of the sphere 
	 * @return value of volume
	 */
	public double getVolume()
	{
		return(1.33*pi*radius*radius*radius);
	}
	
	
	/**
	 * this method returns the name of the shape
	 * @return name of shape
	 */
	public static String getShape()
	{
		return "Sphere";
	}
}
