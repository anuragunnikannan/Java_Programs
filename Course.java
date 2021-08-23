import java.util.*;
class Course
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int n = sc.nextInt();
		int phy, chem, math, total;
		int tot_mp;
		for(int i = 1;i<=n;i++)
		{
			System.out.println("\nEnter marks in Maths:");
			math = sc.nextInt();
			System.out.println("Enter marks in Physics:");
			phy = sc.nextInt();
			System.out.println("Enter marks in Chemistry:");
			chem = sc.nextInt();
			total = math+phy+chem;
			tot_mp = phy+math;
			if((math>=60 && phy>=50 && chem>=40 && total>=200)||(tot_mp>=150))
			{
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Not Eligible");
			}
		}
		sc.close();
	}
}