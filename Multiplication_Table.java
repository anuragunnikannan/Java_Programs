import java.util.*;
class Multiplication_Table
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for multiplication table:");
		int n = sc.nextInt();
		System.out.println("Enter number of terms: ");
		int m = sc.nextInt();
		int product = 0;
		for(int i = 1;i<=m;i++)
		{
			product = n*i;
			System.out.println(n+" x "+i+" = "+product);
		}
		sc.close();
	}
}