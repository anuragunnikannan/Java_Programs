import java.util.*;
public class Add_Indexwise
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements for 1st array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("Enter "+n+" elements for 1st array: ");
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("\nEnter "+n+" elements for 2nd array: ");
        for(int i = 0;i<n;i++)
        {
            b[i] = sc.nextInt();
        }
        int c[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            c[i] = a[i] + b[i];
        }
        System.out.println("\nNew Array: ");
        for(int i = 0;i<n;i++)
        {
            System.out.println(c[i]);
        }
    }
}
