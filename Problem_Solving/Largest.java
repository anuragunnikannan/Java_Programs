import java.util.*;
public class Largest
{
	public void merge(int arr[], int low, int mid, int high)
	{
		int n1 = mid-low+1;
		int n2 = high-mid;
		int x[] = new int[n1]; //left subarray
		int y[] = new int[n2]; //right subarray
		int k = low;
		for(int i = 0;i<n1;i++)
		{
			x[i] = arr[low+i];
		}
		for(int i = 0;i<n2;i++)
		{
			y[i] = arr[mid+i+1];
		}
		int i = 0, j = 0;
		while(i < n1 && j < n2)
		{
			if(x[i] < y[j])
			{
				arr[k] = y[j];
				j++;
			}
			else
			{
				arr[k] = x[i];
				i++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k++] = x[i];
			i++;
		}
		while(j<n2)
		{
			arr[k++] = y[j];
			j++;
		}
	}
	
	public void mergesort(int arr[], int low, int high)
	{
		if(low < high)
		{
			int mid = (low+high)/2;
			mergesort(arr, low, mid);
			mergesort(arr, mid+1,high);
			merge(arr, low, mid, high);
		}
	}
	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		Largest obj = new Largest();
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		obj.mergesort(arr, 0, n-1);
		System.out.println("Enter k:");
		int k = sc.nextInt();
		for(int i = 0;i<k;i++)
		{
			System.out.print(arr[i]+" ");
		}
        sc.close();
    }
}