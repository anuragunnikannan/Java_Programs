import java.util.*;
class minimum_sum
{
    public static double max(double arr[])
    {   
        double m = 0.0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>m)
                m=arr[i];
        }
        return m;

    }
    public static double sum(double arr[])
    {
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
      return sum;  
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of elements");
        int n =sc.nextInt();
        System.out.println("enter value of k");
        int k =sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextDouble();
        }
        while(k!=0)
        {
            double m=max(arr);
            int pos=0;
            for(int i =0;i<n;i++)
            {
                if (arr[i]==m)
                pos=i;
            }
            arr[pos]=Math.floor(m/2);
            k--;
        }
        System.out.println(sum(arr));
        sc.close();
    }
}