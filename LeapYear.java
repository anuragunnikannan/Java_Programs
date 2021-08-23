import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		boolean res = false;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					res = true;
				}
				else
				{
					res = false;
				}
			}
			else
			{
				res = true;
			}
		}
		else
		{
			res = false;
		}
		if(res==true)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
		sc.close();
	}
}