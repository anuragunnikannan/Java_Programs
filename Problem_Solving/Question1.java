import java.util.*;
public class Question1
{
    static String arr[] = new String[10000000];
    static int count = 0;
    public void permutation(String str, String soFar)
    {
        if(str.length() == 0)
        {
            arr[count++] = soFar;
            return;
        }
        for(int i = 0;i<str.length();i++)
        {
            char x = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            String sol = left + right;
            permutation(sol, soFar+x);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Question1 obj = new Question1();
        int r = sc.nextInt();   //number of tables
        int n = sc.nextInt();   //number of persons
        String str = "";
        for(int i = 1;i<=n;i++)
        {
            str = str + Integer.toString(i);
        }
        obj.permutation(str, "");
        for(int i = 0;i<count;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}