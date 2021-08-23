import java.util.*;
class Circle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int radius = sc.nextInt();
		double perimeter = 2*3.14*radius;
		double area = 3.14*radius*radius;
		System.out.println("Perimeter: "+perimeter);
		System.out.println("Area: "+area);
		sc.close();
	}
}