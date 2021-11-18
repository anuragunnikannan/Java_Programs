import java.util.*;
public class Bank
{
	public double calcEMI(int principal, double rate, int period)
	{
		return (principal * rate)/(1 - 1/Math.pow((1 + rate), (period * 12)));
	}
	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		Bank obj = new Bank();
        System.out.println("Enter principal:");
        int p = sc.nextInt();
		System.out.println("Enter total time:");
		int t = sc.nextInt();
		System.out.println("Enter number of slabs:");
		int s1 = sc.nextInt();
		System.out.println("FOR BANK A:");
		int period1[] = new int[s1];
		double rate1[] = new double[s1];
		for(int i = 0;i<s1;i++)
		{
			period1[i] = sc.nextInt();
			rate1[i] = sc.nextDouble();
		}
		System.out.println("FOR BANK B");
		System.out.println("Enter number of slabs:");
		int s2 = sc.nextInt();
		int period2[] = new int[s2];
		double rate2[] = new double[s2];
		for(int i = 0;i<s2;i++)
		{
			period2[i] = sc.nextInt();
			rate2[i] = sc.nextDouble();
		}
		double em1 = 0.0, em2 = 0.0;
		for(int i = 0;i<s1;i++)
		{
			em1 += obj.calcEMI(p, rate1[i], period1[i]);
		}
		for(int i = 0;i<s2;i++)
		{
			em2 += obj.calcEMI(p, rate2[i], period2[i]);
		}
		if(em1 < em2)
		{
			System.out.println("Bank A");
		}
		else
		{
			System.out.println("Bank B");
		}
        sc.close();
    }
}