import java.io.*;
public class Header
{
    public void sales(int s, double c)
    {
        System.out.println((double)s*(1-c/100));
    }
    public void print_calendar(String start_day, int month, int year)
    {
        String d[] = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int days = 0;
        switch(month)
        {
            case 1:
            days = 31;
            break;
            case 2:
            if(year%4==0)
            {
                if(year%100==0)
                {
                    if(year%400==0)
                    {
                        days = 29;
                    }
                    else
                    {
                        days = 28;
                    }
                }
                else
                {
                    days = 29;
                }
            }
            else
            {
                days = 28;
            }
            break;
            case 3:
            days = 31;
            break;
            case 4:
            days = 30;
            break;
            case 5:
            days = 31;
            break;
            case 6:
            days = 30;
            break;
            case 7:
            days = 31;
            break;
            case 8:
            days = 31;
            break;
            case 9:
            days = 30;
            break;
            case 10:
            days = 31;
            break;
            case 11:
            days = 30;
            break;
            case 12:
            days = 31;
            break;
            default:
            System.out.println("Invalid Month");
        }
        int x = 0;
        for(int i = 0;i<7;i++)
        {
            if(d[i].equalsIgnoreCase(start_day)==true)
            {
                x = i+1;
            }
            System.out.print(d[i]+"\t");
        }
        System.out.println();
        for(int i = 1;i<x;i++)
        {
            System.out.print("\t");
        }
        int y = 1;
        while(y<=days)
        {
            if(x<=7)
            {
                System.out.print(y+"\t");
                y++;
                x++;
            }
            else
            {
                x = 1;
                System.out.println();
            }
        }
    }
    public void sqrt(int x)
    {
        System.out.println("Square Root of "+x+" is "+Math.sqrt(x));
    }
    public boolean even(int x)
    {
        if(x%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void message(String x, int n)
    {
        for(int i = 1;i<=n;i++)
        {
            System.out.println(x);
        }
    }
    public void loan(int amt, int t, double r)
    {
        double mr = r/1200;
        double pay = (amt*Math.pow(1+mr, t*12))/12;
        System.out.println("Monthly Payment: "+pay);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Header he = new Header();
        System.out.println("Enter sales amount:");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter commission rate: ");
        double c = Double.parseDouble(br.readLine());
        he.sales(a, c);
        System.out.println("\nEnter start day: ");
        String s = br.readLine();
        System.out.println("Enter month number: ");
        int m = Integer.parseInt(br.readLine());
        System.out.println("Enter year: ");
        int y = Integer.parseInt(br.readLine());
        he.print_calendar(s, m, y);
        System.out.println("\nEnter a number:");
        int n = Integer.parseInt(br.readLine());
        he.sqrt(n);
        System.out.println("\nEnter a number: ");
        int x = Integer.parseInt(br.readLine());
        System.out.println(he.even(x));
        System.out.println("\nEnter a message:");
        String t = br.readLine();
        System.out.println("Enter number of times to print message: ");
        int z = Integer.parseInt(br.readLine());
        he.message(t, z);
        System.out.println("\nEnter amount: ");
        int amt = Integer.parseInt(br.readLine());
        System.out.println("Enter years: ");
        int time = Integer.parseInt(br.readLine());
        System.out.println("Enter annual interest rate:");
        double rate = Double.parseDouble(br.readLine());
        he.loan(amt, time, rate);

    }
}