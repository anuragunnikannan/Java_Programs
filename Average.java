import java.util.*;
public class Average
{
    int n;
    int arr[];
    public Average(int n, int arr[])
    {
        this.n = n;
        this.arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            this.arr[i] = arr[i];
        }
    }
    public void calc_avg()
    {
        int sum = 0;
        double avg = 0.0;
        for(int i = 0;i<n;i++)
        {
            sum+=arr[i];
        }
        avg = (double)sum/n;
        System.out.println("Average = "+avg);
        System.out.println("Elements above average: ");
        for(int i = 0;i<n;i++)
        {
            if(arr[i]>avg)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Average av = new Average(n, arr);
        av.calc_avg();
        sc.close();
    }
}