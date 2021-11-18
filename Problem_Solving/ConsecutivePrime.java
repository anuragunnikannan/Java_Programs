import java.util.*;
public class ConsecutivePrime
{
	public static boolean isPrime(int n)
	{
		int f = 0;
		for(int i = 2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				f = 1;
			}
			else
			{
				f = 0;
			}
		}
		if(f == 1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		for(int i = 5;i<=n;i++)
		{
			if(isPrime(i))
			{
				for(int j = 2;j<i;j++)
				{
					if(isPrime(j))
					{
						sum += j;
					}
					if(i == sum)
					{
						count++;
						sum = 0;
						break;
					}
					if(sum > i)
					{
						sum = 0;
						break;
					}
				}
			}
		}
		System.out.println(count);
        sc.close();
    }
}