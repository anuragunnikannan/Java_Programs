import java.util.*;
class Commission
{
    int sales;
    Commission(int s)
    {
        sales = s;
    }
    public int commission(int s)
    {
        if(s>=10000)
        {
            return 8000;
        }
        else if(s>=8000)
        {
            return 6000;
        }
        else if(s>=6000)
        {
            return 4000;
        }
        else if(s>=4000)
        {
            return 2000;
        }
        else if(s>=2000)
        {
            return 1000;
        }
        else
        {
            return 500;
        }
    }
}

public class Demo2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales:");
        int sales = sc.nextInt();
        Commission co = new Commission(sales);
        if(sales>0)
        {
            System.out.println("Commission = "+co.commission(sales));
        }
        else
        {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}