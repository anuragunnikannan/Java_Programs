import java.util.*;
public class PairSum
{
    public static void checkPairSum(ArrayList<Integer> arr, int sum)
    {
        Collections.sort(arr);
        int low = 0, high = arr.size()-1;
        while(low < high)
        {
            if(arr.get(low) + arr.get(high) < sum)
            {
                low++;
            }
            else if(arr.get(low) + arr.get(high) > sum)
            {
                high--;
            }
            else
            {
                System.out.println(arr.get(low)+", "+arr.get(high));
                break;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }
        System.out.println("Enter target sum:");
        int sum = sc.nextInt();
        checkPairSum(arr, sum);
        sc.close();
    }
}