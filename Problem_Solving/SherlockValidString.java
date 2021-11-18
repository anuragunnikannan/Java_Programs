import java.util.*;
public class SherlockValidString
{
    public void merge(int arr[], int low, int mid, int high)
    {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int x[] = new int[n1];
        int y[] = new int[n2];
        for(int i = 0;i<n1;i++)
        {
            x[i] = arr[i];
        }
        for(int i = 0;i<n2;i++)
        {
            y[i] = arr[mid+1+i];
        }
        int i = 0, j = 0, k = low;
        while(i < n1 && j < n2)
        {
            if(x[i] <= y[j])
            {
                arr[k] = x[i];
                i++;
            }
            else
            {
                arr[k] = y[j];
                j++;
            }
            k++;
        }
        while(i < n1)
        {
            arr[k++] = x[i++];
        }
        while(j < n2)
        {
            arr[k++] = y[j++];
        }
    }
    public void mergesort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int mid = (low + high) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        SherlockValidString sv = new SherlockValidString();
        String s = sc.nextLine();
        int l = s.length();
        int freq[] = new int[26];
        for(int i = 0;i<26;i++)
        {
            freq[i] = 0;
        }
        for(int i = 0;i<l;i++)
        {
            freq[(int)s.charAt(i)-97]++;
        }
        sv.mergesort(freq, 0, 25);
        int i = 0;
        while(freq[i] == 0)
        {
            i++;
        }
        int min = freq[i];
        int max = freq[25];
        if(min == max)
        {
            System.out.println("YES");
        }
        else
        {
            if(((max - min == 1) && (max > freq[i])) || (min == 1) && (freq[i+1] == max))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}