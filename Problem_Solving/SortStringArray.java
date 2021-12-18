import java.util.*;
public class SortStringArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        System.out.println("Enter "+n+" elements:");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextLine();
        }
        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1]) > 0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted String Array:");
        for(int i = 0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}