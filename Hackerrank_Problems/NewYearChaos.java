import java.util.*;
public class NewYearChaos
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t!=0)
        {
            t--;
            int flag = 0;
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            for(int i = n-1;i >= 0;i--)
            {
                if(arr[i] - (i+1) > 2)
                {
                    System.out.println("Too chaotic");
                    flag = 1;
                    break;
                }
                for(int j = Math.max(0, arr[i]-2); j < i;j++)
                {
                    if(arr[j] > arr[i])
                    {
                        ans++;
                    }
                }
            }
            if(flag != 1)
            {
                System.out.println(ans);
            }
        }
        sc.close();
    }
}