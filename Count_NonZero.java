import java.util.*;
public class Count_NonZero
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
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                count++;
            }
        }
        System.out.println("Number of non zero elements = "+count);
        sc.close();
    }
}