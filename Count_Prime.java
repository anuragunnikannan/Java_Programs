import java.util.*;
public class Count_Prime
{
    public boolean isPrime(int x)
    {
        int c = 0;
        for(int i = 1;i<=x;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Count_Prime cp = new Count_Prime();
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int p = 0;
        for(int i = 0;i<n;i++)
        {
            if(cp.isPrime(arr[i])==true)
            {
                p++;
            }
        }
        System.out.println("Number of prime numbers = "+p);
        sc.close();
    }
}