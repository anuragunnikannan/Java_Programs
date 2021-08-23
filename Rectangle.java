import java.util.*;
class Rectangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		int length = sc.nextInt();
		System.out.println("Enter breadth:");
		int breadth = sc.nextInt();
		int perimeter = 2*(length+breadth);
		int area = length*breadth;
		System.out.println("Perimeter: "+perimeter);
		System.out.println("Area: "+area);
		sc.close();
	}
}