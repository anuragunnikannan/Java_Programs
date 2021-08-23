import java.util.*;
public class Linear_Search
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
        System.out.println("Enter element to be searched: ");
        int k = sc.nextInt();
        int pos = -1;
        for(int i = 0;i<n;i++)
        {
            if(arr[i]==k)
            {
                pos = i+1;
                break;
            }
        }
        if(pos!=-1)
        {
            System.out.println(k+" found at position "+pos);
        }
        else
        {
            System.out.println("Not found!");
        }
        sc.close();
    }
}