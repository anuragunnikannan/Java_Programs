import java.util.*;
public class Oddsum_2D
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter "+(n*n)+" elements: ");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(arr[i][j]%2!=0)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of odd numbers = "+sum);
        sc.close();
    }
}