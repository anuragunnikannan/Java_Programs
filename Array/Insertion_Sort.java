import java.util.*;
public class Insertion_Sort
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
        for(int i = 1;i<n;i++)
        {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && temp <= arr[j])
            {
                //swapping previous element with next element
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println("Sorted Array: ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}