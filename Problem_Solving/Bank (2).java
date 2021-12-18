import java.util.*;
abstract class Account
{
	int accno;
	double balance;
	Account(int a, double b)
	{
		accno = a;
		balance = b;
	}
	
	void deposit(double am)
	{
		balance += am;
	}
	
	abstract void withdrawal(double am);
	abstract void addInterest();
	
	void showBalance()
	{
		System.out.println("Account Number: "+accno);
		System.out.println("Balance: "+balance);
	}
}

class Savings extends Account
{
    double roi;
	double minb;
	Savings(int accno, double balance, double r, double m)
	{
		super(accno, balance);
		roi = r;
		minb = m;
	}
	
	void withdrawal(double am)
	{
		if(balance - am > minb)
		{
			balance -= am;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	
	void addInterest()
	{
		balance += balance*(roi/100)*12;
	}
}

class Current extends Account
{
	double negative;
	Current(int accno, double balance, double n)
	{
		super(accno, balance);
		negative = n;
	}
	
	void withdrawal(double am)
	{
		if(balance-am >= negative)
		{
			balance -= am;
		}
		else
		{
			balance = balance - am;
			balance = balance - (negative-balance)*0.1;
		}
	}
	
	void addInterest()
	{
		return;
	}
}

class Fixed extends Account
{
	double roi;
	double amt;
	Fixed(int accno, double balance, double r, double a)
	{
		super(accno, balance);
		roi = r;
		amt = a;
	}
	
	void withdrawal(double amt)
	{
		balance += amt*(roi/100)*12;
	}
	
	void addInterest()
	{
		return;
	}
}

public class Bank
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int accno = sc.nextInt();
		System.out.println("1. Savings");
		System.out.println("2. Current");
		System.out.println("3. Fixed");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		System.out.println("Enter amount to be deposited:");
		double d = sc.nextDouble();
		Account obj;
		String res;
		double r;
		switch(choice)
		{
			case 1:
			System.out.println("Enter rate of interest:");
			r = sc.nextDouble();
			System.out.println("Enter minimum balance:");
			double m = sc.nextDouble();
			sc.nextLine();
			obj = new Savings(accno, 0.0, r, m);
			obj.deposit(d);
			System.out.println("Do you want to withdraw? Y/N");
			res = sc.nextLine();
			if(res.equalsIgnoreCase("Y"))
			{
				System.out.println("Enter amount to be withdrawn:");
				double w = sc.nextDouble();
				obj.withdrawal(w);
			}
			obj.addInterest();
			obj.showBalance();
			break;
			case 2:
			System.out.println("Enter negative limit:");
			double n = sc.nextDouble();
			sc.nextLine();
			obj = new Current(accno, 0.0, n);
			obj.deposit(d);
			System.out.println("Do you want to withdraw? Y/N");
			res = sc.nextLine();
			if(res.equalsIgnoreCase("Y"))
			{
				System.out.println("Enter amount to be withdrawn:");
				double w = sc.nextDouble();
				obj.withdrawal(w);
			}
			obj.showBalance();
			break;
			case 3:
			System.out.println("Enter rate:");
			r = sc.nextDouble();
			obj = new Fixed(accno, 0.0, r, d);
			obj.deposit(d);
			obj.withdrawal(d);
			obj.showBalance();
			break;
			default:
			System.out.println("Invalid Choice");
		}
		sc.close();
	}
}