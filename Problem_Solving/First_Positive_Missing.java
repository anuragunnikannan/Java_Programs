/*
    Print the first positive missing number present in an array.
    For eg.:
        arr[] = {0, -9, 1, 3, -4, 5}
        first positive missing number is = 2
*/

import java.util.*;
public class First_Positive_Missing
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean check[] = new boolean[100000];
        int missing_number = 0;
        for(int i = 0;i<100000;i++)
        {
            check[i] = false;
        }
        for(int i = 0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                //storing whether a positive number is present in the array or not.
                check[arr[i]] = true;
            }
        }
        for(int i = 0;i<100000;i++)
        {
            if(check[i]==false)
            {
                //as soon as we find a positive missing number, store it in a variable and then exit the loop.
                missing_number = i;
                break;
            }
        }
        System.out.println(missing_number);
        sc.close();
    }
}