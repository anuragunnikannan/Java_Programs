import java.util.*;
public class SpecialSubstring
{
	public boolean checkSpecial(String s)
	{
		
	}
	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String temp = "";
		int count = 0;
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<=i;j++)
			{
				temp = temp + s.charAt(j);
			}
			
			temp="";
		}
        sc.close();
    }
}