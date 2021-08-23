import java.util.*;
class Quadratic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coffecient of x^2: ");
		int a = sc.nextInt();
		System.out.println("Enter coefficient of x: ");
		int b = sc.nextInt();
		System.out.println("Enter value of c: ");
		int c = sc.nextInt();
		double root1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
		double root2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
		System.out.println("Root 1 = "+root1);
		System.out.println("Root 2 = "+root2);
		sc.close();
	}
}