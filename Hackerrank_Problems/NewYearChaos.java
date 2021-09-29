/*
    Print minimum number of bribes required to form the required queue. One person can bribe maximum 2 times, if more than 2 then print "Too chaotic". The queue should have been in ascending order initially.
    
    Sample input & output:
    
    n = 5
    queue: 2 1 5 3 4
    
    minimum number of bribes = 3
    
    n = 8
    queue: 5 1 2 3 7 8 6 4
    
    minimum number of bribes = Too chaotic
    
*/

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