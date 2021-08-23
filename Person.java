import java.util.*;
class Account
{
    int id;
    double balance;
    double annualInterestRate;
    Date dateCreated;
    public Account()
    {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
    }
    public Account(int i,  double b)
    {
        id = i;
        balance = b;
    }
    public void setID(int i)
    {
        id = i;
    }
    public void setBalance(double b)
    {
        balance = b;
    }
    public void setAnnualInterestRate(double in)
    {
        annualInterestRate = in;
    }
    public void setDate(Date d)
    {
        dateCreated = d;
    }
    public double getBalance()
    {
        return balance;
    }
    public Date getDate()
    {
        dateCreated = new Date();
        return dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        double r = annualInterestRate/12;
        return r;
    }
    public double getMonthlyInterest()
    {
        double i = getMonthlyInterestRate()*balance/100;
        return i;
    }
    public void withdraw(int w)
    {
        balance-=w;
    }
    public void deposit(int d)
    {
        balance+=d;
    }
}
public class Person
{
    public static void main(String args[])
    {
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id: ");
        int id = sc.nextInt();
        ac.setID(id);
        System.out.println("Enter balance: ");
        double balance = sc.nextDouble();
        ac.setBalance(balance);
        System.out.println("Enter annual interest rate: ");
        double interest = sc.nextDouble();
        ac.setAnnualInterestRate(interest);
        System.out.println("ID: "+id);
        System.out.println("Balance: "+balance);
        System.out.println("Annual Interest Rate: "+interest);
        System.out.println("Date of Opening Account: "+ac.getDate());
        System.out.println("Monthly Interest Rate: "+ac.getMonthlyInterestRate());
        System.out.println("Monthly Interest: "+ac.getMonthlyInterest());
        System.out.println("Enter 1 to deposit and 2 to withdraw: ");
        int c = sc.nextInt();
        if(c==1)
        {
            System.out.println("Enter amount to be deposited: ");
            int d = sc.nextInt();
            ac.deposit(d);
            System.out.println("New Balance: "+ac.getBalance());
        }
        else if(c==2)
        {
            System.out.println("Enter amount to be withdrawn: ");
            int w = sc.nextInt();
            ac.withdraw(w);
            System.out.println("New Balance: "+ac.getBalance());
        }
        else
        {
            System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}