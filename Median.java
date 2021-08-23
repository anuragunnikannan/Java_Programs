import java.util.*;
class Median
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" elements: ");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for(int i = 0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		double median = 0.0;
		if(n%2!=0)
		{
			median = arr[(n+1)/2-1];
		}
		else
		{
			median = arr[((n/2-1)+(n/2))/2];
		}
		System.out.println("Median: "+median);
		sc.close();
	}
}