import java.util.*;
public class CountSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int output[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        int freq[] = new int[max+1];
        for(int i = 0;i<max+1;i++)
        {
            freq[i] = 0;
        }
        for(int i = 0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        for(int i = 0;i<max;i++)
        {
            freq[i+1] += freq[i];
        }
        for(int i = 0;i<n;i++)
        {
            output[freq[arr[i]]-1] = arr[i];
            freq[arr[i]]--;
        }
        for(int i = 0;i<n;i++)
        {
            System.out.print(output[i]+" ");
        }
        sc.close();
    }
}