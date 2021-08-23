import java.util.*;
public class Merge_Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements for 1st array:");
        int m = sc.nextInt();
        System.out.println("Enter number of elements for 2nd array: ");
        int n = sc.nextInt();
        float a[] = new float[m];
        float b[] = new float[n];
        System.out.println("Enter "+m+" elements for 1st array: ");
        for(int i = 0;i<m;i++)
        {
            a[i] = sc.nextFloat();
        }
        System.out.println("\nEnter "+n+" elements for 2nd array: ");
        for(int i = 0;i<n;i++)
        {
            b[i] = sc.nextFloat();
        }
        float c[] = new float[m+n];
        int x = 0;
        for(int i = 0;i<m;i++)
        {
            c[x++] = a[i];
        }
        for(int i = 0;i<n;i++)
        {
            c[x++] = b[i];
        }
        System.out.println("\nMerged Array: ");
        for(int i = 0;i<x;i++)
        {
            System.out.println(c[i]);
        }
        sc.close();
    }
}