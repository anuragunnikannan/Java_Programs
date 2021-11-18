import java.util.*;
public class Exchange
{
    static String arr[] = new String[50000];
    static int count = 0;

    public void merge(int a[], int low, int mid, int high)
    {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int x[] = new int[n1];
        int y[] = new int[n2];
        for(int i = 0;i<n1;i++)
        {
            x[i] = a[low+i];
        }
        for(int i = 0;i<n2;i++)
        {
            y[i] = a[mid+i+1];
        }
        int i = 0, j = 0, k = low;
        while(i < n1 && j < n2)
        {
            if(x[i] <= y[j])
            {
                a[k] = x[i++];
            }
            else
            {
                a[k] = y[j++];
            }
            k++;
        }
        while(i < n1)
        {
            a[k++] = x[i++];
        }
        while(j < n2)
        {
            a[k++] = y[j++];
        }
    }

    public void mergesort(int a[], int low, int high)
    {
        if(low < high)
        {
            int mid = (low+high)/2;
            mergesort(a, low, mid);
            mergesort(a, mid+1, high);
            merge(a, low, mid, high);
        }
    }

    public void permutations(String str, String soFar)
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
            permutations(sol, soFar+x);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Exchange ex = new Exchange();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = String.valueOf(a);
        int l = str.length();
        ex.permutations(str, "");
        int arr2[] = new int[count];
        for(int i = 0;i<count;i++)
        {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        ex.mergesort(arr2, 0, count-1);
        for(int i = 0;i<count;i++)
        {
            if(arr2[i] > b)
            {
                System.out.println(arr2[i]);
                break;
            }
        }
        sc.close();
    }
}