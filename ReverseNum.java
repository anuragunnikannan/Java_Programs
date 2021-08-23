import java.util.*;
public class ReverseNum
{
    static int num;
    public ReverseNum()
    {
        num = 0;
    }
    public void reverse(int n)
    {
        int r = 0;
        while(n>0)
        {
            int d = n%10;
            r = r*10+d;
            n = n/10;
        }
        System.out.println("Reverse Number: "+r);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ReverseNum rn = new ReverseNum();
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        rn.reverse(num);
        sc.close();
    }
}