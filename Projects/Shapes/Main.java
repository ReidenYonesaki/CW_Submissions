public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Circle is the data type, circOne is the name of the object, new is how constructor gets called, and
//circle(3.0) is constructor call
	
		// Circle (Class Example)
		Circle circOne = new Circle (3.0);
		Circle circTwo = new Circle (30.0);
		Circle circThree = new Circle (-4.0);
		System.out.println(circOne.getRadius());
		System.out.println(circTwo.getRadius());
		System.out.println(circThree.getRadius());
		System.out.println(Circle.getShape());
		
		String shape = Circle.getShape();
		System.out.print(shape);
		
		System.out.println(circOne.getDiameter());
		System.out.println(circTwo.getDiameter());
		System.out.println(circThree.getDiameter());
		
		System.out.println();
		
		//Rectangle
		//Rectangle is the data type, recOne, recTwo, recThree is the name of the object, 
		//new is how constructor gets called, and Rectangle (#) is  the constructor call			
		Rectangle recOne = new Rectangle (2.0 , 7.0);
		Rectangle recTwo = new Rectangle (4.0, 8.0);
		Rectangle recThree = new Rectangle (5.0, 9.0);
		
		
		//This will tell us the shape
		System.out.println("The Shape is a " + Rectangle.getShape ());
		
		
		//This will tell us the length and width of all three rectangles
		System.out.print("The length of rectangle one is " + recOne.getL() + " and ");
		System.out.println( " the width is " + recOne.getW());
		
		System.out.print("The length of rectangle two is " + recTwo.getL() + " and ");
		System.out.println( " the width is " + recTwo.getW());
		
		System.out.print("The length of rectangle three is " + recThree.getL() + " and ");
		System.out.println( " the width is " + recThree.getW());
		
		
		//This will tell us the area of all three rectangles
		System.out.println("The area of rectangle one is " + recOne.getArea());
		System.out.println("The area of rectangle two is " + recTwo.getArea());
		System.out.println("The area of rectangle three is " + recThree.getArea());
		
		
		//This will us the perimeter of all three rectangles
		System.out.println("The perimeter of the rectangle one  is " + recOne.getPerimeter());
		System.out.println("The perimeter of the rectangle two is " + recTwo.getPerimeter());
		System.out.println("The perimeter of the rectangle three is " + recThree.getPerimeter());
		
		
		System.out.println();
		
		//Square
		//Square is the data type, squOne, squTwo, squThree is the name of the object, 
		//new is how constructor gets called, and Square (#) is  the constructor cal			
		Square squOne = new Square (6.0);
		Square squTwo = new Square (7.0);
		Square squThree = new Square (8.0);
		
		
		//This will tell us the shape
		System.out.println("The shape is a " + Square.getShape());
		
		
		//this will tell us the length of all three squares
		System.out.println("The length of square one is " + squOne.getSide());
		System.out.println("The length of square two is " + squTwo.getSide());
		System.out.println("The length of square three is " + squThree.getSide());
		
		
		//this will tell us the perimeter of all three squares
		System.out.println("The perimeter of square one is " + squOne.getPerimeter());
		System.out.println("The perimeter of square two is " + squTwo.getPerimeter());
		System.out.println("The perimeter of square three is " + squThree.getPerimeter());

		
		//This will tell us the area of all three squares
		System.out.println("The area of square one is " + squOne.getArea());
		System.out.println("The area of square two is " + squTwo.getArea());
		System.out.println("The area of square three is " + squThree.getArea());
		
		
		System.out.println();
		
		//Sphere
		//Sphere is the data type, sphOne, sphTwo, sphThree is the name of the object, 
		//new is how constructor gets called, and Sphere (#) is  the constructor call			
		Sphere sphOne = new Sphere (11.0);
		Sphere sphTwo = new Sphere (12.0);
		Sphere sphThree = new Sphere (13.0);
		
		
		//This will give us the shape
		System.out.println("The shape is a " + Sphere.getShape());
		
		
		//This will give us the radius and diameter of all three spheres
		System.out.print("The radius of sphere one is " + sphOne.getRadius() + " and ");
		System.out.println(" the diameter of sphere one is " + sphOne.getDiameter());
		
		System.out.print("The radius of sphere two is " + sphTwo.getRadius() + " and ");
		System.out.println(" the diameter of sphere two is " + sphTwo.getDiameter());
		
		System.out.print("The radius of sphere three is " + sphThree.getRadius() + " and ");
		System.out.println(" the diameter of sphere one is " + sphThree.getDiameter());
		
		
		//This will tell us the circumference of all three spheres
		System.out.println("The circumference of sphere one is " + sphOne.getCircumference());
		System.out.println("The circumference of sphere two is " + sphTwo.getCircumference());
		System.out.println("The circumference of Sphere three is " + sphThree.getCircumference());
		
		
		//This will tell us the surface area of all three spheres
		System.out.println("The surface area of sphere one is " + sphOne.getSurfaceArea());
		System.out.println("The surface area of sphere two is " + sphTwo.getSurfaceArea());
		System.out.println("The surface area of sphere three is " + sphThree.getSurfaceArea());

		
		//This will tell us the volume of all three spheres
		System.out.println("The volume of sphere one is " + sphOne.getVolume());
		System.out.println("The volume of sphere two is " + sphTwo.getVolume());
		System.out.println("The volume of sphere three is " + sphThree.getVolume());
		
		
		System.out.println();
		
		
		//Rhombus
		//Rhombus is the data type, rhomOne, rhomTwo, rhomThree is the name of the object, 
		//new is how constructor gets called, and Rhombus (#) is  the constructor call			
		Rhombus rhomOne = new Rhombus (3.0, 3.0, 4.0);
		Rhombus rhomTwo = new Rhombus (6.0, 6.0, 7.0);
		Rhombus rhomThree = new Rhombus (9.0, 9.0, 10.0);
		
		
		//This will us the shape
		System.out.println("Tne shape is a " + Rhombus.getShape());
		
		
		//This will tell us the diagonol lines and sides of all three rhombuses
		System.out.print("The diagonol lines of rhombus one is " + rhomOne.getDiagonol() + " and " + rhomOne.getDiagonol() + " and ");
		System.out.println(" the side of rhombus one is " + rhomOne.getSide());
		
		System.out.print("The diagonol lines of rhombus two is " + rhomTwo.getDiagonol() + " and " + rhomTwo.getDiagonol() + " and ");
		System.out.println(" the side of rhombus two is " + rhomTwo.getSide());
		
		System.out.print("The diagonol lines of rhombus three is " + rhomThree.getDiagonol() + " and " + rhomThree.getDiagonol() + " and ");
		System.out.println(" the side of rhombus three is " + rhomThree.getSide());
		
		
		//This will tell us the area of all three rhombuses
		System.out.println("The area of rhombus one is " + rhomOne.getArea());
		System.out.println("The area of rhombus two is " + rhomTwo.getArea());
		System.out.println("The area of rhombus three is " + rhomThree.getArea());
		
		
		//This will tell us the perimeter of all three rhombuses
		System.out.println("The perimeter of rhombus one is " + rhomOne.getPerimeter());
		System.out.println("The perimeter of rhombus two is " + rhomTwo.getPerimeter());
		System.out.println("The perimeter of rhombus three is " + rhomThree.getPerimeter());
		
		
		System.out.println();
		
		//Triangle 
		//Triangle is the data type, triOne, triTwo, triThree is the name of the object, 
		//new is how constructor gets called, and Triangle (#) is  the constructor cal
		Triangle triOne = new Triangle (4.0, 5.0, 6.0);
		Triangle triTwo = new Triangle (7.0, 8.0, 9.0);
		Triangle triThree = new Triangle (10.0, 11.0, 12.0);
		
		
		//This will tell us the shape
		System.out.println("The shape is a " + Triangle.getShape());
		
		
		//This will tell us the side, height, base for all three triangles
		System.out.print("The side of triangle one is " + triOne.getSide() + " and " );
		System.out.print(" the height of the triangle one is " + triOne.getHeight() + " and ");
		System.out.println("the base of the triangle one is " + triOne.getBase());
		
		System.out.print("The side of triangle two is " + triTwo.getSide() + " and " );
		System.out.print(" the height of triangle two is " + triTwo.getHeight() + " and ");
		System.out.println("the base of triangle two is " + triTwo.getBase());
		
		System.out.print("The side of triangle three is " + triThree.getSide() + " and " );
		System.out.print(" the height of triangle three is " + triThree.getHeight() + " and ");
		System.out.println("the base of triangle three is " + triThree.getBase());

		
		//This will find the area for all three triangles
		System.out.println("The area of triangle one is " + triOne.getArea());
		System.out.println("The area of triangle two is " + triTwo.getArea());
		System.out.println("The area of triangle three is " + triThree.getArea());
		
		
		//This will find the perimeter for all three triangles 
		System.out.println("The perimeter of triangle one is " + triOne.getPerimeter());
		System.out.println("The perimeter of triangle two is " + triTwo.getPerimeter());
		System.out.println("The perimeter of triangle three is " + triThree.getPerimeter());
		
		
		System.out.print(circOne);
		
		
		System.out.print(recOne.toString());
	}
}
