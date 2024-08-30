/*
 * this class taught use the side, area, and volume of a cube 
 */
public class Intro_Cube {

	public static void main(String[] args) {
		//task 1 : Declare a side length as an int ;
		double side = 40 ; 
		//declared the side length as a side.
		double area = side * side ; 
		//declared the area of the cube as area which would be side times side.
		System.out.print("The side length of a cube is ");
		System.out.print(side);
		System.out.print(" and the area of a cube is ");
		System.out.print((int)area);
		System.out.println(".");
		//printed out the declared values into a sentence
		
		//task 3 : Volume ;
		double volume = side*side*side ;
		//declared the cubes volume as volume which is side times side times side.
		System.out.print("It's volume is ");
		System.out.print((int)volume);
		//the volume is turned from a double into an int.
	}

}
