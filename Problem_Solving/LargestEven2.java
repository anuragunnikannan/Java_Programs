import java.util.*;
public class LargestEven2
{
    public static String findLargestEven(String s)
    {
        char arr[] = s.toCharArray();   //converting string to array of characters
        ArrayList<Character> numArray = new ArrayList<Character>();
        boolean flag = false;
        for(int i = 0; i < arr.length; i++)
        {
            if(Character.isDigit(arr[i]))
            {
                if(!numArray.contains(arr[i]))  //checking for duplicates. If element not present in numArray, then insert to numArray
                {
                    numArray.add(arr[i]);
                    if(Character.getNumericValue(arr[i]) % 2 == 0)  //Checking if there is atleast one even digit
                    {
                        flag = true;
                    }
                }
            }
        }
        if(flag == false)   //If there is no even digit
        {
            return "-1";
        }
        else
        {
            Collections.sort(numArray); //Sorting the digits in ascending order
            char temp = '\0';   //temporary variable to store the smallest even digit.
            String ans = "";
            for(int i = 0; i < numArray.size(); i++)
            {
                if(Character.getNumericValue(numArray.get(i)) % 2 == 0) //The first even digit is picked and stored in temp, and break
                {
                    temp = numArray.get(i);
                    break;
                }
            }
            for(int i = numArray.size() - 1; i >= 0; i--)   //Since, we want largest even number, we traverse the array from last to 1st
            {
                if(numArray.get(i) == temp) //skip the current iteration, when the lowest even digit (temp) is found
                {
                    continue;
                }
                else        //Otherwise keep appending the digits in a string
                {
                    ans = ans + numArray.get(i);
                }
            }
            ans = ans + temp;   //Join the lowest even digit at the end of the number
            return ans;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println(findLargestEven(s));
        sc.close();
    }
}