import java.io.*;
public class Valley
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of steps:");
        int s = Integer.parseInt(br.readLine());
		System.out.println("Enter path:");
		String path = br.readLine();
		int level = 0, prev = 0, val = 0;
		for(int i = 0;i<path.length();i++)
		{
			char x = path.charAt(i);
			if(x=='U')
			{
				level++;
			}
			else if(x=='D')
			{
				level--;
			}
			if(level < 0)
			{
				prev = 1;
			}
			else if(level == 0 && prev == 1)
			{
				val++;
				prev = 0;
			}
		}
		
		System.out.println(val);
    }
}