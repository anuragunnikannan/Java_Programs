import java.util.*;
public class Rocks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rocks:");
		int ro = sc.nextInt();
		System.out.println("Enter number of ranges:");
        int ra = sc.nextInt();
		int rocks[] = new int[ro];
		System.out.println("Enter rock numbers:");
		for(int i = 0;i<ro;i++)
		{
			rocks[i] = sc.nextInt();
		}
		int results[] = new int[ra];
		for(int i = 0;i<ra;i++)
		{
			System.out.println("Enter lower and upper limits:");
			int lower = sc.nextInt();
			int upper = sc.nextInt();
			for(int j = 0;j<ro;j++)
			{
				if(rocks[j] >= lower && rocks[j] <= upper)
				{
					results[i]++;
				}
			}
		}
		for(int i = 0;i<ra;i++)
		{
			System.out.print(results[i]+" ");
		}
        sc.close();
    }
}