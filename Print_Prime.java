import java.util.*;
class Print_Prime
{
	public boolean checkPrime(int n)
	{
		int c = 0;
		for(int i = 1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		Print_Prime pp = new Print_Prime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit: ");
		int lower = sc.nextInt();
		System.out.println("Enter upper limit: ");
		int upper = sc.nextInt();
		for(int i = lower;i<=upper;i++)
		{
			if(pp.checkPrime(i)==true)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}