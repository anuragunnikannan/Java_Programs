import java.util.*;
public class Sum_2D
{
    static int a[][];
    static int b[][];
    static int c[][];
    static int n;
    static Scanner sc = new Scanner(System.in);
    public void input(int z[][], int n)
    {
        System.out.println("Enter "+(n*n)+" elements:");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                z[i][j] = sc.nextInt();
            }
        }
    }
    public void display(int z[][])
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(z[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        n = sc.nextInt();
        a = new int[n][n];
        b = new int[n][n];
        c = new int[n][n];
        Sum_2D su = new Sum_2D();
        su.input(a, n);
        su.input(b, n);
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println("\n1st matrix:");
        su.display(a);
        System.out.println("\n2nd matrix:");
        su.display(b);
        System.out.println("\nSum:");
        su.display(c);
        sc.close();
    }
}