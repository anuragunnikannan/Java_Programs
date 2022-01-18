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
    public int getEquilibrium(int arr[], int n)
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