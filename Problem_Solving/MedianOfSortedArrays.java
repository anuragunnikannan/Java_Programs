import java.util.*;
public class MedianOfSortedArrays
{
    public double findMedianNaive(int a[], int b[])
    {
        int total = a.length + b.length;
        int i = 0, j = 0;
        double m1 = 0.0, m2 = 0.0;
        if(total % 2 != 0)      //for odd number of total elements
        {
            for(int k = 0;k<=total/2;k++)
            {
                if(i != a.length && j != b.length)
                {
                    if(b[j] < a[i])
                    {
                        m1 = b[j++];       //if element of b[] is smaller than that of a[], pick b[]
                    }
                    else
                    {
                        m1 = a[i++];       //else pick a[]
                    }
                }
                else if(i < a.length)
                {
                    m1 = a[i++];           //if only elements of a[] are remaining, pick a[]
                }
                else
                {
                    m1 = b[j++];           //if only elements of b[] are remaining, pick b[]
                }
            }
            return m1;  //returning the median when number of elements are odd.
        }
        else            //for even number of elements
        {
            for(int k = 0;k<=total/2;k++)
            {
                m2 = m1;    //since general formula for median (for even elements) is (n/2 th obs. + (n/2)+1 th obs.) / 2. So we need   to store 2 consecutive middle elements. So m2 will store the n/2 th obs. & m1 will store the next element, i.e. n/2 + 1 th obs.

                // rest of the logic is exactly same. We just need to return (m1 + m2)/2 at the end.
                if(i != a.length && j != b.length)
                {
                    if(b[j] < a[i])
                    {
                        m1 = b[j++];    //if element of b[] is smaller than that of a[], pick b[]
                    }
                    else
                    {
                        m1 = a[i++];    //else pick a[]
                    }
                }
                else if(i < a.length)
                {
                    m1 = a[i++];        //if elements of only a[] are remaining, pick a[]
                }
                else
                {
                    m1 = b[j++];        //if elements of only b[] are remaining, pick b[]
                }
            }
            return (m1 + m2)/2;
        }
    }

    public double findMedian(int a[], int b[])
    {
        int total = a.length + b.length;
        int low = 0, high = a.length;
        while(low <= high)
        {
            int cut1 = (low+high)/2;            //cut1 denotes number of elements from a[] in the left part OR we can say, partition of a[]
            int cut2 = (total + 1)/2 - cut1;    //cut2 denotes number of elements from b[] in the left part OR we can say, partition of b[]

            double a_left = (cut1 != 0) ? a[cut1 - 1] : Double.MIN_VALUE;       //element of a[] that is 1 left to the partition
            double b_left = (cut2 != 0) ? b[cut2 - 1] : Double.MIN_VALUE;       //element of b[] that is 1 left to the partition

            double a_right = (cut1 != a.length) ? a[cut1] : Double.MAX_VALUE;   //element of a[] that is 1 right to the partition
            double b_right = (cut2 != b.length) ? b[cut2] : Double.MAX_VALUE;   //element of b[] that is 1 right to the partition

            /*Alternative to using ternary operator*/
            /* if(cut1 != 0)
            {
                a_left = a[cut1 - 1];
            }
            else
            {
                a_left = Integer.MIN_VALUE;
            }

            if(cut2 != 0)
            {
                b_left = b[cut2 - 1];
            }
            else
            {
                b_left = Integer.MIN_VALUE;
            }

            if(cut1 != a.length)
            {
                a_right = a[cut1];
            }
            else
            {
                a_right = Integer.MAX_VALUE;
            }

            if(cut2 != b.length)
            {
                b_right = b[cut2];
            }
            else
            {
                b_right = Integer.MAX_VALUE;
            } */

            /* 
                If we check whether the element of a[] that is 1 left to the partition is <= element of b[] that is 1 right to the partition, we are guaranteed that other elements to the left are also less, because both a[] and b[] are sorted. Similarly we also check whether the element of b[] that is 1 left to the partition is <= element of a[] that is 1 right to the partition.
            */


            if(a_left <= b_right && b_left <= a_right)      //main condition
            {
                if(total % 2 == 0)  //for even number of elements
                {
                    return (Math.max(a_left, b_left) + Math.min(a_right, b_right))/2;
                }
                else    //for odd number of elements
                {
                    return Math.max(a_left, b_left);
                }
            }
            else if(a_left > b_right)   //if 1st condition fails, then we take one element less from a[] and one element more from b[]
            {
                high = cut1 - 1;    // go to line 72-73 to understand the change
            }
            else                        //if 2nd condition fails, then we take one element more from a[] and one less from b[]
            {
                low = cut1 + 1;     //go to line 72-73 to understand the change
            }
        }
        return 0.0;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        MedianOfSortedArrays me = new MedianOfSortedArrays();
        System.out.println();
        int t = sc.nextInt();
        while(t > 0)
        {
            t--;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            for(int i = 0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            for(int i = 0;i<m;i++)
            {
                b[i] = sc.nextInt();
            }
            /* System.out.println(me.findMedianNaive(a, b)); */     //uncomment to run naive method
            
            //we swap a[] and b[] if size of b is smaller, because we will perform binary search on smaller array, and it will make it easier
            if(m < n)
            {
                System.out.println(me.findMedian(b, a));
            }
            else
            {
                System.out.println(me.findMedian(a, b));
            }
        }
        sc.close();
    }
}