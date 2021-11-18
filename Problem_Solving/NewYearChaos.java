/*
    Print minimum number of bribes required to form the required queue. One person can bribe maximum 2 times, if more than 2 then print "Too chaotic". The queue should have been in ascending order initially.
    
    Sample input & output:
    
    n = 5
    queue: 2 1 5 3 4    original queue: 1 2 3 4 5
    
    minimum number of bribes = 3
    
    n = 8
    queue: 5 1 2 3 7 8 6 4      original queue: 1 2 3 4 5 6 7 8
    
    minimum number of bribes = Too chaotic
    
*/
import java.util.*;
public class NewYearChaos
{
    public void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String args[])
    {
        NewYearChaos nyc = new NewYearChaos();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            t--;
            int bribes = 0;
            int flag = 0;
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i = n-1;i >= 0; i--)
            {
                //if the element is not in its original position then
                if(arr[i] != (i+1))
                {
                    if((i - 1) >= 0 && (arr[i-1] == (i+1)))
                    {
                        /*  Case 1: for bribing 1 person.
                        If i-1 is not beyond the first position and the element in front of arr[i] is equal to i, then swap. (Here i+1 is used because of 0 based indexing)
                        */
                        bribes++;
                        nyc.swap(arr, i-1, i);
                    }
                    else if((i - 2) >= 0 && (arr[i-2] == (i+1)))
                    {
                        /*  Case 2: for bribing 2 persons.
                        If i-2 is not beyond the first position and the element in front of arr[i-1] is equal to i, then swap. (Here i+1 is used because of 0 based indexing)
                        */
                        bribes += 2;
                        nyc.swap(arr, i-2, i-1);
                        nyc.swap(arr, i-1, i);
                    }
                    else
                    {
                        //  Case 3: if bribing more than 2 persons is required
                        System.out.println("Too chaotic");
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag != 1)
            {
                System.out.println(bribes);
            }
        }
        sc.close();
    }
}