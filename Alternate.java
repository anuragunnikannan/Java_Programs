import java.util.*;
public class Alternate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nAlternate elements: ");
        for(int i = 0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}