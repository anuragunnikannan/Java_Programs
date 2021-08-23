import java.util.*;
public class Count_Character
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int lc = 0, uc = 0, d = 0, sp = 0;
        int l = s.length();
        for(int i = 0;i<l;i++)
        {
            char x = s.charAt(i);
            if(Character.isLowerCase(x))
            {
                lc++;
            }
            else if(Character.isUpperCase(x))
            {
                uc++;
            }
            else if(Character.isDigit(x))
            {
                d++;
            }
            else if(Character.isWhitespace(x))
            {
                sp++;
            }
        }
        System.out.println("Number of Lower Case Characters: "+lc);
        System.out.println("Number of Upper Case Characters: "+uc);
        System.out.println("Number of digits: "+d);
        System.out.println("Number of spaces: "+sp);
        sc.close();
    }
}