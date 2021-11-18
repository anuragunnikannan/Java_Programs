import java.util.*;
public class Candies
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of test cases:");
        int t = sc.nextInt();
		while(t!=0)
		{
			t--;
			System.out.println("Enter number of boxes:");
			int n = sc.nextInt();
			int arr[] = new int[n];
			int c[] = new int[1000];
			for(int i = 0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int x = 0;
			int s = 0;
			c[x] = arr[0] + arr[1];
			s += c[x++];
			for(int i = 2;i<n;i++)
			{
				c[x] = c[x-1] + arr[i];
				s += c[x];
				x++;
			}
			System.out.println(s);
		}
        sc.close();
    }
}