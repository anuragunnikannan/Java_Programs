/*
    Print the maximum sum of hourglass that is possible from a given 6x6 matrix. Here in this example 19 is the answer since:
                    
            2 4 4
              2
            1 2 4    ======>   2 + 4 + 4 + 2 + 1 + 2 + 4 = 19
    
    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 2 4 4 0
    0 0 0 2 0 0
    0 0 1 2 4 0
    
    19
*/
import java.util.*;
public class hourglass
{
    //takes the hourglass pattern from the 3x3 matrix sliced from the original matrix and returns the sum.
    public int sum(int arr[][], int a, int b)
    {
        int sum = 0;
        for(int i = a;i<a+3;i++)
        {
            for(int j = b;j<b+3;j++)
            {
                // first part of the condition is for ignoring element at left middle, and second part is for ignoring element at right middle
                if((i==a+1 && j==b) || (i==a+1 && j==b+2))
                {
                    continue;
                }
                else
                {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        hourglass hg = new hourglass();
        int arr[][] = new int[6][6];
        for(int i = 0;i<6;i++)
        {
            for(int j = 0;j<6;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int i = 0, j = 0;
        int maxSum = Integer.MIN_VALUE;
        while(i+2 < 6)
        {
            while(j+2 < 6)
            {
                if(maxSum < hg.sum(arr, i, j))
                {
                    maxSum = hg.sum(arr, i, j);
                }
                j++;
            }
            j = 0;
            i++;
        }
        System.out.println(maxSum);
        sc.close();
    }
}