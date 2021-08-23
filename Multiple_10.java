import java.util.*;
class Multiple_10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit: ");
		int lower = sc.nextInt();
		System.out.println("Enter upper limit: ");
		int upper = sc.nextInt();
		for(int i = lower;i<=upper;i++)
		{
			if(i%10==0)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}