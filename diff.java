import java.util.*;
public class diff
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int d1 = 0, d2 = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i==j)
                {
                    d1 = d1+arr[i][j];
                }
            }
        }
        for(int i = 0;i<n;i++)
        {
            for(int j = n-1;j>=0;j--)
            {
                if(i+j==n-1)
                {
                    d2 = d2 + arr[i][j];
                }
            }
        }
        int diff = Math.abs(d1-d2);
        System.out.println(diff);
        sc.close();
    }
}