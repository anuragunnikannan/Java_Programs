import java.util.*;
public class Linear_Search
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search: ");
        int key = sc.nextInt();
        int f = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Element found at position "+(i+1));
                f = 1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Element not found");
        }
        sc.close();
    }
}