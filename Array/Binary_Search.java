import java.util.*;
public class Binary_Search
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
        int low = 0;
        int high = n;
        int f = 0;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if (key < arr[mid])
            {
                high = mid - 1;
            }
            else if(key > arr[mid])
            {
                low = mid + 1;
            }
            else if(key == arr[mid])
            {
                System.out.println("Element found at position "+(mid+1));
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