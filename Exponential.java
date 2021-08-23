import java.util.*;
class Exponential
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println("Enter power:");
		int p = sc.nextInt();
		double res = Math.pow(n,p);
		System.out.println("Result: "+res);
		sc.close();
	}
}