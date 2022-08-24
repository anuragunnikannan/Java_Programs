import java.util.*;
public class WordRank
{
	public static int search(char x, char c[])
	{
		int low = 0;
		int high = c.length - 1;
		while(low <= high)
		{
			int mid = (low + high) / 2;
			if(c[mid] > x)
			{
				high--;
			}
			else if(c[mid] < x)
			{
				low++;
			}
			else if(c[mid] == x)
			{
				return mid+1;
			}
		}
		return -1;
	}
	
	public static int fact(int n)
	{
		int f = 1;
		for(int i = 1; i <= n; i++)
		{
			f *= i;
		}
		return f;
	}
	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String s = sc.nextLine();
		s = s.toUpperCase();
		char c[] = s.toCharArray();
		Arrays.sort(c);
		int pos[] = new int[s.length()];
		int x = 0;
		for(int i = 0; i < s.length(); i++)
		{
			pos[x++] = search(s.charAt(i), c);
		}
		int rank = 0;
		for(int i = 0; i < x; i++)
		{
			int count = 0;
			for(int j = i+1; j < x; j++)
			{
				if(pos[j] < pos[i])
				{
					count++;
				}
			}
			System.out.print(count+ " ");
			rank = rank + count * fact(x - i - 1);
		}
		rank = rank + 1;	//to also include the rank of the current word
		System.out.println("\n"+rank);
        sc.close();
    }
}