import java.util.*;
public class Quick_Sort
{
    public int partition(int arr[], int low, int high)
    {
        //taking first element as pivot
        int pivot_index = low;
        int pivot = arr[pivot_index];
        while(low < high)
        {
            //if left pointer is less than pivot, shift to right
            while(arr[low] <= pivot)
            {
                low++;
            }
            //if right pointer is more than pivot, shift to left
            while(arr[high] > pivot)
            {
                high--;
            }
            //if left and right not crossed each other, swap left and right
            if(low < high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        //if left and right crosses each other, swap pivot and right
        int temp = arr[high];
        arr[high] = arr[pivot_index];
        arr[pivot_index] = temp;
        return high;
    }

    public void quicksort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int m = partition(arr, low, high);
            quicksort(arr, low, m-1);
            quicksort(arr, m+1, high);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Quick_Sort qs = new Quick_Sort();
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        qs.quicksort(arr, 0, n-1);
        System.out.println("Sorted Array: ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }        
        sc.close();
    }
}