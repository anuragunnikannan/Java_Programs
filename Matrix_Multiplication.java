import java.util.*;
public class Matrix_Multiplication
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
        Matrix_Multiplication mm = new Matrix_Multiplication();
        System.out.println("Enter value of n:");
        n = sc.nextInt();
        a = new int[n][n];
        b = new int[n][n];
        c = new int[n][n];
        System.out.println("\nEnter "+(n*n)+" elements for matrix A: ");
        mm.input(a);
        System.out.println("\nEnter "+(n*n)+" elements for matrix B: ");
        mm.input(b);
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                c[i][j] = 0;
                for(int k = 0;k<n;k++)
                {
                    c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("\nMatrix A: ");
        mm.print(a);
        System.out.println("\nMatrix B: ");
        mm.print(b);
        System.out.println("\nProduct: ");
        mm.print(c);
    }
}