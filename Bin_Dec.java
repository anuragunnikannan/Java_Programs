import java.util.*;
class Bin_Dec
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Binary to Decimal");
		System.out.println("2. Decimal to Binary");
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Enter binary number: ");
			int bin = sc.nextInt();
			String b = Integer.toString(bin);
			int l = b.length();
			double dec = 0;
			for(int i = 0;i<=l;i++)
			{
				int d = bin%10;
				dec = dec+d*Math.pow(2, i);
				bin = bin/10;
			}
			System.out.println("Decimal Number: "+dec);
			break;
			case 2:
			System.out.println("Enter decimal number: ");
			int de = sc.nextInt();
			int binary[] = new int[32];
			int i = 0;
			while(de>0)
			{
				binary[i] = de%2;
				de = de/2;
				i++;
			}
			System.out.print("Binary Number: ");
			for(int j = i-1;j>=0;j--)
			{
				System.out.print(binary[j]);
			}
			break;
			default:
			System.out.println("Invalid Choice!");
		}
		sc.close();
	}
}