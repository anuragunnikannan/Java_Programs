import java.util.*;
class Multiple_Check
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of m:");
		int m = sc.nextInt();
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		if(m%n==0)
		{
			System.out.println(m+" is a multiple of "+n);
		}
		else
		{
			System.out.println(m+" is not a multiple of "+n);
		}
		sc.close();
	}
}