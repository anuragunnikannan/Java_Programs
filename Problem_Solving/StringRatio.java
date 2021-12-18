import java.util.*;
public class StringRatio
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        int l = s.length();
        s = s.toLowerCase();
        int maxLen = 0;
        double vowels = 0.0, consonants = 0.0;
        String t = "", longest = "";
        for(int i = 0;i<l;i++)
        {
            char x = s.charAt(i);
            if(x != ' ')
            {
                t = t + x;
                if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
                {
                    vowels++;
                }
                else if(x != 'a' || x != 'e' || x != 'i' || x != 'o' || x != 'u')
                {
                    consonants++;
                }
            }
            if(x == ' ')
            {
                if(t.length() > maxLen)
                {
                    maxLen = t.length();
                    longest = t;
                }
                t = "";
            }
        }
        System.out.println("Longest Word: "+longest);
        System.out.println("Vowels/Consonants Ratio: "+vowels/consonants);
        sc.close();
    }
}