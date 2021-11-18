import java.util.*;
public class Mark_And_Toys
{
    public void merge(int arr[], int low, int mid, int high)
    {
        int n1 = mid - low + 1; //size of left subarray
        int n2 = high - mid;    //size of right subarray
        int x[] = new int[n1];  //left subarray
        int y[] = new int[n2];  //right subarray
        for(int i = 0;i < n1;i++)
        {
            x[i] = arr[low+i];    //storing elements in left subarray from low to mid
        }
        for(int i = 0;i<n2;i++)
        {
            y[i] = arr[mid+i+1];    //storing elements in right subarray from mid + 1 to high
        }
        int i = 0, j = 0, k = low;
        while(i < n1 && j < n2)
        {
            if(x[i] <= y[j])
            {
                arr[k] = x[i];  //if current element of left subarray is smaller than that of right subarray, store the less one in the main array
                i++;
            }
            else
            {
                arr[k] = y[j];  //else store current element of right subarray in the main array
                j++;
            }
            k++;
        }
        while(i < n1)   //copying remaining elements (if any) from left subarray
        {
            arr[k] = x[i];
            i++;
            k++;
        }
        while(j < n2)   //copying remaining elements (if any) from right subarray
        {
            arr[k] = y[j];
            j++;
            k++;
        }
    }
    public void mergesort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int mid = (low + high) / 2;
            mergesort(arr, low, mid);   //left subarray
            mergesort(arr, mid+1, high);    //right subarray
            merge(arr, low, mid, high); //merging the subarrays after sorting
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Mark_And_Toys mt = new Mark_And_Toys();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        mt.mergesort(arr, 0, n-1);
        int count = 0;
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            if(sum+arr[i] < k)
            {
                sum += arr[i];
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}