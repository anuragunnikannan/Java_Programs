import java.util.*;
public class Diagonal_Sum
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
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i==j)
                {
                    sum1+=arr[i][j];
                }
                if((i+j)==(n-1))
                {
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.println("Matrix: ");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Sum of left diagonal: "+sum1);
        System.out.println("Sum of right diagnal: "+sum2);
        sc.close();
    }
}