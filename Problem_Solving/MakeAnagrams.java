import java.util.*;
public class MakeAnagrams
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int totalLength = a.length() + b.length();  //Storing sum of length of both the strings
        int freqA[] = new int[26];  //frequency array of each letters for string A
        int freqB[] = new int[26];  //frequency array of each letters for string B
        int count = 0;
        for(int i = 0;i<a.length();i++)
        {
            freqA[(int)a.charAt(i)-97]++;   //Storing frequency of each letters of string A
        }
        for(int i = 0;i<b.length();i++)
        {
            freqB[(int)b.charAt(i)-97]++;   //Storing frequency of each letters of string B
        }
        for(int i = 0;i<26;i++)
        {
            if(freqA[i] != 0 && freqB[i] != 0)  //if a letter exist in both string A and string B
            {
                count += (int)Math.min(freqA[i], freqB[i])*2;   //take the minimum frequency of that letter between the two strings and multiply them by 2 since we have 2 strings. Keep adding the value to count
            }
        }
        System.out.println(totalLength-count);  //So, total number of deletions = total length of both strings - coun
        sc.close();
    }
}