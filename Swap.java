import java.util.*;
class Swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("a = "+a+" b = "+b);
		a = a-b;
		b = b+a;
		a = b-a;
		System.out.println("After Swapping");
		System.out.println("a = "+a+" b = "+b);
		sc.close();
	}
}