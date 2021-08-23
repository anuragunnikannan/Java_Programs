import java.util.*;
class Euler_Number
{
	public int factorial(int x)
	{
		int f = 1;
		for(int i = 1;i<=x;i++)
		{
			f*=i;
		}
		return f;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Euler_Number en = new Euler_Number();
		System.out.println("Enter value of n: ");
		int n = sc.nextInt();
		double e = 0.0;
		for(int i = 1;i<=n;i++)
		{
			e = e+(double)1/en.factorial(i);
		}
		System.out.println("e= "+e);
		sc.close();
	}
}