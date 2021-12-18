import java.util.*;
public class ice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0)
        {
            t--;
            int m = sc.nextInt();
            int n = sc.nextInt();
            int cost[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                cost[i] = sc.nextInt();
            }
            int pos1 = 0, pos2 = 0;
            for(int i = 0;i<n-1;i++)
            {
                for(int j = i+1;j<n;j++)
                {
                    if(cost[i] + cost[j] == m)
                    {
                        pos1 = i+1;
                        pos2 = j+1;
                    }
                }
            }
            System.out.println(pos1 + " " +pos2);
        }
    }
}
