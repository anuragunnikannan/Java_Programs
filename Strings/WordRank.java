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

    public static int countRepetitions(String s)
    {
    	if(s.length() == 0)
    	{
    		return 1;
    	}
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray())
        {
        	if(map.containsKey(x))
        	{
        		map.put(x, map.get(x)+1);
        	}
        	else
        	{
        		map.put(x, 1);
        	}
        }
        int count = 0;
        for(char key : map.keySet())
        {
        	if(map.get(key) > 1)
        	{
        		count += map.get(key);
        	}
        }
		return count;
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
		double rank = 0.0;
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
			double w = fact(countRepetitions(s.substring(i)));
			double y = count/w;
			double z = fact(x - i - 1);
			rank = rank + y * z;
		}
		rank = rank + 1.0;	//to also include the rank of the current word
		System.out.println("\n"+rank);
        sc.close();
    }
}
