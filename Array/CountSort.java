import java.util.*;
public class CountSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int output[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        int max = Integer.MIN_VALUE;
        //Taking input for array and storing the maximum element
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        //Initializing frequency array with 0s. Size is max+1 because each index will store frequency of that particular number. Eg. if max is 8, then size = max + 1 means frequency of 8 will be stored at position 8 (0-based indexing)
        int freq[] = new int[max+1];
        for(int i = 0;i<max+1;i++)
        {
            freq[i] = 0;
        }

        //Storing frequency of each element of the array
        for(int i = 0;i<n;i++)
        {
            freq[arr[i]]++;
        }

        //Storing cumulative sum of frequency array
        for(int i = 0;i<max;i++)
        {
            freq[i+1] += freq[i];
        }

        /*
        Find the index of each element of the original array in new frequency array (cumulative sum), and place the elements in output array. Decrement the element by 1 of frequency array.

        Eg. arr[] =>    4 2 2 8 3 3 1
            freq[] =>   0 1 3 5 6 6 6 6 7

            output[] => 0 0 0 0 0 4 0   (output[freq[4]-1] => output[6-1] => output[5] = arr[0])

            new freq[] = 0 1 3 5 5 6 6 6 7  (decrement freq[4] by 1 so that next time, the same element is placed just before the current one)

        */
        for(int i = 0;i<n;i++)
        {
            output[freq[arr[i]]-1] = arr[i];
            freq[arr[i]]--;
        }
        for(int i = 0;i<n;i++)
        {
            System.out.print(output[i]+" ");
        }
        sc.close();
    }
}