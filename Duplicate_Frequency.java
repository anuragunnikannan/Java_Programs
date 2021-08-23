import java.util.*;
public class Duplicate_Frequency
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int v = -1;
        int fr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            int x = 1;
            for(int j = i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    x++;
                    fr[j] = v;
                }
            }
            if(fr[i]!=v)
            {
                fr[i] = x;
            }
        }
        System.out.println("\nDuplicates \tFrequency");
        for(int i = 0;i<fr.length;i++)
        {
            if(fr[i]!=v && fr[i]>1)
            {
                System.out.println(arr[i]+" \t\t "+fr[i]);
            }
        }
        sc.close();
    }
}