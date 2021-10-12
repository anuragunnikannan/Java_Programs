/*
    Print the minimum number of swaps to sort an array consisting of consecutive integers from 1 to n without any duplicates.
    
    Sample input & output:
    
    7
    7 1 3 2 4 5 6
    5
*/
import java.util.*;
public class MinimumSwaps
{
    public void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        MinimumSwaps ms = new MinimumSwaps();
        int n = sc.nextInt();
        int arr[] = new int[n];
        int swaps = 0;
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE, minIndex = 0;
        // Storing minimum element of the array and its index
        for(int i = 0; i < n; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
                minIndex = i;
            }
        }
        // swapping minimum element, so that first element will be sorted.
        if(minIndex != 0)
        {
            ms.swap(arr, 0, minIndex);
            swaps++;
        }
        for(int i = 1; i < n ; i++)     //starting from 1 because first element is already in its original position
        {
            int pos = arr[i] - arr[0];
            while(pos != i)
            {
                ms.swap(arr, i, pos);
                swaps++;
                pos = arr[i]-arr[0];
            }
        }
        System.out.println(swaps);
        sc.close();
    }
}