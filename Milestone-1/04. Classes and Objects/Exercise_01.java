/*
 * Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
 * The dimensions of the Box are width, height, depth. The class should have a method that can return 
 * the volume of the box. Create an object of the Box class and test the functionalities.
 * 
 */

class Box
{
	double width, height, depth;
	Box(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	{
		return (width*height*depth);
	}
}

public class Exercise_01 
{
	public static void main(String args[])
	{
		Box box= new Box(2.5, 1.5,2.5);
		System.out.print("Volume of the box: "+box.volume());
	}
	
}
