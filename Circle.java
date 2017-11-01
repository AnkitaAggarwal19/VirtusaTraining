import java.util.*;

class Circle{
	double radius;
	String color;

	//default constructor
	Circle()
	{
		radius = 1.0;
		color = "Red";
	}

	//parameterised constructor
	Circle(double r)
	{
		radius = r;
	}

	//returns radius
	public double getRadius()
	{
		return radius;
	}
	
	//returns Area
	public double getArea()
	{
		return 22/7 * radius * radius;
	}

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the radius");

		Circle obj_def = new Circle();
		Circle obj_para = new Circle(scan.nextDouble());
		System.out.println();

		System.out.println("Default radius = " + obj_def.getRadius());
		System.out.println("Default area = " + obj_def.getArea() + "\n");

		System.out.println("User Radius = " + obj_para.getRadius());
		System.out.println("User Area = " + obj_para.getArea());
	}
}
