import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int n1 = n;
		int r = 0;
		while(n1>0)
		{
			int d = n1%10;
			r = r*10+d;
			n1 = n1/10;
		}
		System.out.println("Reversed Number: "+r);
		sc.close();
	}
}