import java.io.*;
public class AlternatingCharacters
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        int q = Integer.parseInt(br.readLine());
        char arr[] = {'A', 'B'};
        while(q != 0)
        {
            q--;
            String a = br.readLine();
            int count = 0;
            for(int i = 0;i<a.length()-1;i++)
            {
                if(a.charAt(i) == arr[0] || a.charAt(i) == arr[1])
                {
                    if(a.charAt(i) == a.charAt(i+1))
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}