import java.util.*;
public class Sum_Avg
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
        int sum = 0;
        double avg = 0.0;
        for(int i = 0;i<n;i++)
        {
            sum = sum+arr[i];
        }
        avg = sum/n;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        sc.close();
    }
}