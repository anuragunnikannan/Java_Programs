import java.util.*;
import java.io.*;

public class Sum {
  public static void main(String args[]) throws IOException {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    
    int n=Integer.parseInt(br.readLine());
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=Integer.parseInt(br.readLine());
    }
    int maxsofar=arr[0];
    int maxsum=arr[0];
    for(int i=1;i<n;i++)
    {
      maxsofar=Math.max(arr[i],maxsofar +arr[i]);
      if(maxsofar>maxsum)
        maxsum=maxsofar;
    }
      System.out.println(maxsum);
    
}
}