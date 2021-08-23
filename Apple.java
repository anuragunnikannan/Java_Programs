import java.util.*;
public class Apple
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float arr[] = new float[7];
        float sum = 0.0f, avg = 0.0f;
        for(int i = 0;i<7;i++)
        {
            System.out.println("Enter apple sales for day "+(i+1));
            arr[i] = sc.nextFloat();
            sum+=arr[i];
        }
        avg = sum/7;
        System.out.println("Average = "+avg);
        sc.close();
    }
}