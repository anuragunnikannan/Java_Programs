import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class RotateArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of left rotations:");
        int d = sc.nextInt();
        int b[] = new int[n];
        int x = 0;
        for(int i = d;i<n;i++)
        {
            b[x++] = arr[i];
        }
        for(int i = 0;i<d;i++)
        {
            b[x++] = arr[i];
        }
        for(int i = 0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
        sc.close();
    }
}