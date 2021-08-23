import java.util.*;
class duplicate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		int arr[] = new int[5];
		for(int i = 0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		int temp[] = new int[5];
		int k = 0;
		for(int i = 0;i<5;i++)
		{
			int flag = 0;
			for(int j = i+1;j<5;j++)
			{
				if(arr[i]==arr[j])
				{
					flag = 1;
					break;
				}
			}
			if(flag==0)
			{
				temp[k++] = arr[i];
			}
		}
		System.out.println();
		for(int i = 0;i<k;i++)
		{
			System.out.println(temp[i]);
		}
	}
}