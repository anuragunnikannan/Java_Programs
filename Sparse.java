import java.util.*;
public class Sparse
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
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    count++;
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
        if(count>(n*n)/2)
        {
            System.out.println("Sparse Matrix");
        }
        else
        {
            System.out.println("Not Sparse Matrix");
        }
        sc.close();
    }
}