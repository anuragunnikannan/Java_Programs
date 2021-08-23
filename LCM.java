import java.util.*;
class LCM
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();
		int lcm = 0;
		if(a>b)
		{
			lcm = a;
		}
		else
		{
			lcm = b;
		}
		while(true)
		{
			if(lcm%a==0 && lcm%b==0)
			{
				System.out.println("LCM: "+lcm);
				break;
			}
			++lcm;
		}
		sc.close();
	}
}