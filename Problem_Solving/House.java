public class House
{
    public int max(int arr[])
    {
        int m = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>m)
            {
                m = arr[i];
            }
        }
        return m;
    }
    public static void main(String args[])
    {
        House obj = new House();
        int val[] = {6, 7, 1, 3, 8, 2, 5};
        int maxSum = 0;
        int n = val.length;
        int pos = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(val[j]==obj.max(val))
                {
                    maxSum += val[j];
                    pos = j;
                    if(j-1 >= 0 && j+1 < n)
                    {
                        val[pos] = 0;
                        val[pos-1] = 0;
                        val[pos+1] = 0;
                        break;
                    }
                    else if(j==0)
                    {
                        val[pos] = 0;
                        val[pos+1] = 0;
                        break;
                    }
                    else if(j==n-1)
                    {
                        val[pos] = 0;
                        val[pos-1] = 0;
                        break;
                    }
                }
            }
            
            /* for(int j = 0;j<n;j++)
            {
                if(j!=pos && j!=pos-1 && j!=pos+1)
                {
                    arr[j] = val[j];
                }
            } */
        }
        System.out.println(maxSum);
    }
}