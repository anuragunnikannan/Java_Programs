/*
    A query of size m is given. Each query has three items- a, b, k; where a and b are starting and ending indices respectively, and k is a number to be added to elements of an array of size n starting from a to b. Print the maximum element after executing all the queries.

    NOTE: The indices given in the queries are 1 based indexing.

    Sample input & output:
    5 3 
    1 2 100
    2 5 100
    3 4 100
    200
*/

import java.util.*;
public class ArrayManipulation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //size of array
        int m = sc.nextInt();   //number of queries
        long arr[] = new long[n+1];
        //n+1 because when last element is also included in the query, we will subtract k from the n+1 th element.
        for(int i = 0; i < n; i++)
        {
            arr[i] = 0;
        }
        //  time complexity => O(n+m)
        // brute force => O(n^2)
        while(m > 0)
        {
            m--;
            int a = sc.nextInt();   //staring index (1-based)
            int b = sc.nextInt();   //ending index (1-based)
            int k = sc.nextInt();   //number to be added to array
            arr[a-1] += k;  //adding the number to the element at starting index
            arr[b] -= k;    //subtracting the number from the element at ending index + 1 (here b because of 0 based indexing)

            // if we do prefix sum, we will get the actual array
            /*
                0 0 0 0 0 0
                100 0 -100 0 0 0 => 100 100 0 0 0
            */
        }
        long max  = Long.MIN_VALUE;
        long sum = 0;
        // storing maximum sum of the actual new array
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
        sc.close();
    }
}