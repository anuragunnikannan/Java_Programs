import java.util.*;
public class ConsecutiveSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int l = s.length();
        int arr[] = new int[n];
        int x = l-1;
        int sum = 0;
        while(n>0)
        {
            int d = n%10;
            arr[x--] = d;
            n = n/10;
        }
        for(int i = 0;i<l-1;i++)
        {
            sum = sum+arr[i]*10+arr[i+1];
        }
        System.out.println("Consecutive Sum = "+sum);
        sc.close();
    }
}