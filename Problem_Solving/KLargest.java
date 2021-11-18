import java.util.*;
public class KLargest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
		System.out.println("Enter k:");
		int k = sc.nextInt();
		int arr[] = new int[n];
		int x = 0;
		for(int i = 1;i<=n;i++)
		{
			if(n%i==0)
			{
				arr[x++] = i;
			}
		}
		if(k > x)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(arr[x-k]);
		}
        sc.close();
    }
}