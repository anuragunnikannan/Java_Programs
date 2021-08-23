import java.util.Scanner;
class pal
{
	public String reverse(String s)
	{
		int l = s.length();
		String r = "";
		for(int i = l-1;i>=0;i--)
		{
			char x = s.charAt(i);
			r = r+x;
		}
		return r;
	}
	
	public int check(String s)
	{
		int l = s.length();
		int flag = 0;
		String t = "";
		for(int i = 0;i<l;i++)
		{
			for(int j = 0;j<l;j++)
			{
				if(i!=j)
				{
					t = t+s.charAt(j);
				}
			}
			System.out.println(t);
			if(t.equals(reverse(t)))
			{
				flag = 1;
				break;									
			}
			t = "";
		}
		if(flag==1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String a = sc.nextLine();
		pal pa = new pal();
		if(pa.check(a)==1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
		sc.close();
	}
}