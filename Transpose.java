import java.util.*;
public class Transpose
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
        System.out.println("\nOriginal Matrix: ");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\nTranspose: ");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}