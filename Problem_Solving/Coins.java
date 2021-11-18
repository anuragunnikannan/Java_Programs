import java.util.*;
public class Coins
{
    public int[] countCoins(int n)
    {
        int c[] = {0, 0, 0};
        c[0] = n/5;
        c[1] = (n%5)/2;
        c[2] = ((n%5)%2);
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Coins obj = new Coins();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        
        int t[] = new int[3];
        int x = 0;
        int sum = 0;
        for(int i = 1;i<=n;i++)
        {
            int c[] = new int[3];
            c = obj.countCoins(i);
            for(int j = 0;j<3;j++)
            {
                /* t[j] += c[j]; */
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
        /* for(int i = 0;i<3;i++)
        {
            System.out.print(t[i]+" ");
        } */
        sc.close();
    }
}