import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int n1 = n;
		int r = 0;
		while(n>0)
		{
			int d = n%10;
			r = r*10+d;
			n = n/10;
		}
		if(r==n1)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		sc.close();
	}
}