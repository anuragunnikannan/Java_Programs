import java.util.*;
public class apples
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int m1,m2,p1,p2,n;
        n=sc.nextInt();
        m1=sc.nextInt();
        p1=sc.nextInt();
        m2=sc.nextInt();
        p2=sc.nextInt();
        int x=0,y=0;
        int sum=0;
        if(p1 < p2)
        {
            int a = (n%m1);
            while(true)
            {
                if(a >=m2)
                {
                    x = (n/m1)-1;
                    y = (n-(x*m1))/m2;
                    break;
                }
                else
                {
                    a = n%((n/m1)-1);
                }
            }
        }
        else
        {
            int a = (n%m2);
            while(true)
            {
                if(a >= m1)
                {
                    x = (n/m2)-1;
                    y = (n-(x*m2))/m1;
                    break;
                }
                else
                {
                    a = n%((n/m2)-1);
                }
			}
		}
        sum=x*p1+y*p2;
        System.out.println(sum);       
    }
}