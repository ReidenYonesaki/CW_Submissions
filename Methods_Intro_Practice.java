public class Methods_Intro_Practice {

	public static void main(String[] args) {

		stateName();
		stateHairStyle();
		stateFavoriteFood();
		printCircleStats(5);
		printCircleStats(7,8);
	}
	//This will print my name, hair style, and favorite food and things about me
	public static void stateName()
	{
		System.out.print("My name is Reiden Yonesaki") ;
		System.out.println() ;
	}
	public static void stateEyeColor()
	{
		System.out.println("My eye color is brown") ;
	}
	public static void stateHairStyle()
	{
		System.out.println("My hairstyle is a side comb") ;
	}
	public static void stateBestFriend()
	{
		System.out.println("My best friend is Justin Nguyen");
	}
	public static void stateFavoriteFood()
	{
		System.out.println("My favorite food is Loco Moco") ;
	}
	//This will print diameter, circumference and area using the radius
	public static void printCircleStats(double x)
	{
		double dia=2*x ;
		double pi = 3.141592653589793238462643383279502884197 ;
		double circ = pi*dia ;
		double area = pi*x*x ;
		
			System.out.print("The radius is ");
			System.out.println(x);
			System.out.print("The diameter is ");
			System.out.println(dia);
			System.out.print("The Circumference is ");
			System.out.println(circ);
			System.out.print("The area is ");
			System.out.println(area);
			System.out.println(" ");
	}
	//This will print sum, difference, prod, quo, and remainder using two numbers
	public static void printCircleStats(int y, int z)
	{
		int sum = y+z ;
		int diff = y-z ;
		int prod = y*z ;
		int quot = y/z ;
		int mod = y%z ;
			System.out.println(y+"+"+z+"="+sum);
			System.out.println(y+"-"+z+"="+diff);
			System.out.println(y+"*"+z+"="+prod);
			System.out.println(y+"/"+z+"="+quot+" with a remainder of "+mod);
	}
}
