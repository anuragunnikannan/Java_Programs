import java.util.*;
public class Interest
{
    public double calc_interest(double principal, double rate, int year)
    {
        return principal*Math.pow(1+rate, year*12);
    }
    public static void main(String args[])
    {
        Interest in = new Interest();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal: ");
        double p = sc.nextDouble();
        System.out.println("Enter annual rate:");
        double r = sc.nextDouble();
        double mr = r/1200;
        System.out.println("Years\tFuture Value");
        for(int i = 1;i<=30;i++)
        {
            System.out.printf(i+"\t"+"%11.2f",in.calc_interest(p, mr, i));
            System.out.println();
        }
        sc.close();
    }
}