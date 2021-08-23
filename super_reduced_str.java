import java.util.*;
public class super_reduced_str
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 1;i<str.length();i++)
        {
            if(str.charAt(i-1)==str.charAt(i))
            {
                str = str.substring(0, i-1) + str.substring(i+1);
                i = 0;
            }
        }
        if(str.length()==0)
        {
            System.out.println("Empty String");
        }
        else
        {
            System.out.println(str);
        }
        sc.close();
    }
}