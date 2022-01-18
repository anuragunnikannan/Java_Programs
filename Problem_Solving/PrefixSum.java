/*
    Given an array, we need to find the sum of elements from specified starting index to an ending index.
    
    array  -->  1 2 3 4 5
    query  -->  startIndex = 2  endIndex = 4    (0 based)
    
    result = 3 + 4 + 5 = 12
*/

import java.util.*;
public class PrefixSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of queries:");
        int q = sc.nextInt();
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1;i<n;i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }
        int i = 1;
        while(i <= q)
        {
            System.out.println("Enter start position:");
            int startPosition = sc.nextInt();
            System.out.println("Enter end position:");
            int endPosition = sc.nextInt();
            System.out.println(prefix[endPosition] - prefix[startPosition - 1]);
            i++;
        }
        sc.close();
    }
}