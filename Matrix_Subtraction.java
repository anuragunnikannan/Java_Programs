import java.util.*;
public class Matrix_Subtraction
{
    static Scanner sc = new Scanner(System.in);
    static int a[][];
    static int b[][];
    static int c[][];
    static int n;
    public void input(int arr[][])
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public void print(int arr[][])
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Matrix_Subtraction ms = new Matrix_Subtraction();
        System.out.println("Enter value of n:");
        n = sc.nextInt();
        a = new int[n][n];
        b = new int[n][n];
        c = new int[n][n];
        System.out.println("\nEnter "+(n*n)+" elements for matrix A: ");
        ms.input(a);
        System.out.println("\nEnter "+(n*n)+" elements for matrix B: ");
        ms.input(b);
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                c[i][j] = a[i][j]-b[i][j];
            }
        }
        System.out.println("\nMatrix A: ");
        ms.print(a);
        System.out.println("\nMatrix B: ");
        ms.print(b);
        System.out.println("\nDifference: ");
        ms.print(c);
    }
}