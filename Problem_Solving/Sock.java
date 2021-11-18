import java.util.*;
public class Sock
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of socks:");
        int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements for array:");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int freq[] = new int[100];
		for(int i = 0;i<n;i++)
		{
			freq[arr[i]]++;
		}
		int pair = 0;
		for(int i = 0;i<freq.length;i++)
		{
			pair += freq[i]/2;
		}
		System.out.println(pair);
        sc.close();
    }
}