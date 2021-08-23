import java.util.*;
public class MergeSortedArray
{
    static Scanner sc = new Scanner(System.in);
    static int a[];
    static int b[];
    static int c[];
    static int m;
    static int n;
    public void input(int arr[], int x)
    {
        for(int i = 0;i<x;i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String args[])
    {
        MergeSortedArray msa = new MergeSortedArray();
        System.out.println("Enter size of array A: ");
        m = sc.nextInt();
        System.out.println("\nEnter size of array B: ");
        n = sc.nextInt();
        a = new int[m];
        b = new int[n];
        c = new int[m+n];
        System.out.println("\nEnter "+m+" elements for Array A: ");
        msa.input(a, m);
        System.out.println("\nEnter "+n+" elements for Array B: ");
        msa.input(b, n);
        int x = 0;
        int i = 0, j = 0;
        while(i<m && j<n)
        {
            if(a[i]<b[j])
            {
                c[x++] = a[i++];
            }
            else
            {
                c[x++] = b[j++];
            }
        }
        while(i<m)
        {
            c[x++] = a[i++];
        }
        while(j<n)
        {
            c[x++] = b[j++];
        }
        System.out.println("\nMerged Array: ");
        for(i = 0;i<x;i++)
        {
            System.out.println(c[i]);
        }
        sc.close();
    }
}