import java.util.*;
class Max3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number:");
		int c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("Maximum is "+a);
		}
		if(b>a && b>c)
		{
			System.out.println("Maximum is "+b);
		}
		if(c>a && c>b)
		{
			System.out.println("Maximum is "+c);
		}
		sc.close();
	}
}