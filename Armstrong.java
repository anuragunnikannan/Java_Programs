import java.util.*;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int n1 = n;
		double s = 0;
		while(n>0)
		{
			int d = n%10;
			s = s+Math.pow(d, 3);
			n = n/10;
		}
		if(s==n1)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		sc.close();
	}
}