/*
    An equilibrium point is one, when the sum of elements to the left of it is equal to the sum of elements to the right
    
    Eg.
    2 3 6 3 2
    
    6 is the equilibrium point, as sum of elements to the left (2+3) = 5 and sum of elements to the right (3+2) = 5 are equal.
    So answer is position of 6, that is 3 (1 based)
*/

import java.util.*;
public class Equilibrium1
{
    /* public int getEquilibrium(int arr[], int n)
    {
        int sum = 0, leftsum = 0;
        for(int i = 0;i<n;i++)
        {
            sum += arr[i];  //Storing sum of all elements
        }
        for(int i = 0;i<n;i++)
        {
            sum -= arr[i];  //Here, sum is acting as rightsum
            if(leftsum == sum)  //If leftsum is equal to rightsum, return the index (1 based)
            {
                return i+1;
            }
            leftsum += arr[i];  //Store the sum of elements that are subtracted from rightsum
        }
        return -1;  //if no equilibrium exists
    } */
    
    public int getEquilibrium(int arr[], int n)
    {
        int prefix[] = new int[n];
        prefix[0] = arr[0]; //Storing prefixSum of first element. Prefix Sum is just the cumulative sum
        for(int i = 1;i<n;i++)  //Loop starting from 1 since, sum of 1st element is already stored
        {
            prefix[i] = prefix[i-1] + arr[i];   //Cumulative sum
        }
        for(int i = 0;i<n;i++)
        {
            int leftsum = 0;
            if(i > 0)
            {
                leftsum = prefix[i-1]; //if there is atleast one element in the left part, then store it into left sum
            }
            int rightsum = prefix[n-1] - prefix[i];   //Rightsum is equal to last element of prefixSum - the current element
            if(leftsum == rightsum)    //if both leftsum and rightsum are equal, then return the 1 based index. Else -1
            {
                return i+1;
            }
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Equilibrium1 eq = new Equilibrium1();
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(eq.getEquilibrium(arr, n));
        sc.close();
    }
}