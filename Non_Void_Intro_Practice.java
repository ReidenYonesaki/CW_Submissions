public class Non_Void_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stateName());
		System.out.println(stateEyeColor());
		System.out.println(stateFavoriteFood());
		System.out.println(stateHairStyle());
		System.out.println(stateBestFriend());
		
	//This method will print my name, eye color, favorite food, hair style, and best friend
	}
	public static String stateName()
	{
		return("My name is Reiden Yonesaki");
	
	}
	public static String stateEyeColor()
	{
		return("My eye color is brown") ;
	}
	public static String stateHairStyle()
	{
		return ("My hairstyle is a side comb") ;
	}
	public static String stateBestFriend()
	{
		return("My best friend is Justin Nguyen");
	}
	public static String stateFavoriteFood()
	{
		return("My favorite food is Loco Moco") ;
	}
	
	//non void methods passes the method as a double x and it prints the radius then 
	//calculates the diameter, circumference, and area of a circle
	public static double calcDiameter(double radius)
	{
		return(2*radius);
	}
		
	public static double calcCircumference(double radius)
	{
		return(2*radius);
	}
		
	public static double calcArea(double radius)
	{
		return(radius*radius);
	}
	//This new non void method method passes two ints and prints their sums 
	public static int addNums(int x, int y)
	{
		System.out.print("The sum of " + x + "+" + y + "=");
		return(x+y);
	}
	
	public static int subNums(int x, int y)
	{
		System.out.print("The differnece of " + x + "-" + y + "=");
		return(x-y);
	}
	
	public static int multNums(int x, int y)
	{
		System.out.print("The product of " + x + "*" + y + "=");
		return(x*y);
	}
	
	public static int quoNums(int x, int y)
	{
		System.out.print("The quotient of " + x + "/" + y + "=");
		return(x/y);
	}
	
	public static int modNums(int x, int y)
	{
		System.out.print("The modulus of " + x + "%" + y + "=");
		return(x%y);
	}
	{
	}
 }
	

