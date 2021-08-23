import java.util.*;
public class calc2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number followed by operator (Press = to stop):");
        String a = sc.nextLine();
        int n = 0, op = 0;
        for(int i = 0;i<a.length();i++)
        {
            char x = a.charAt(i);
            if(x >= '0' && x <= '9')
            {
                n++;
            }
            else if(x=='+' || x=='-' || x=='*' || x=='/' || x=='%' || x=='=')
            {
                op++;
            }
        }
        int num[] = new int[n];
        char oper[] = new char[op];
        String b = "";
        int c = 0, d= 0;
        for(int i = 0;i<a.length();i++)
        {
            char x = a.charAt(i);
            if(x >= '0' && x<='9')
            {
                b = b+x;
            }
            else if(x=='+' || x=='-' || x=='*' || x=='/' || x=='%' || x=='=')
            {
                num[c++] = Integer.parseInt(b);
                oper[d++] = x;
                b = "";
            }
            
        }
        int res = num[0];
        c = 1;
        for(int i = 0;i<op;i++)
        {
            if(oper[i]=='+')
            {
                res+=num[c];
            }
            else if(oper[i]=='-')
            {
                res-=num[c];
            }
            else if(oper[i]=='*')
            {
                res*=num[c];
            }
            else if(oper[i]=='/')
            {
                res/=num[c];
            }
            else if(oper[i]=='%')
            {
                res%=num[c];
            }
            else if(oper[i]=='=')
            {
                System.out.println(res);
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid Operator!");
            }
            c++;
        }
        sc.close();
    }
}