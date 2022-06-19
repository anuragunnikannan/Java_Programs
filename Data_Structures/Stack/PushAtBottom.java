import java.util.*;
public class PushAtBottom
{
    public static void pushAtBottom(int data, Stack<Integer> s)
    {
        if(s.empty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    
    public static void reverse(Stack<Integer> s)
    {
        if(s.empty())
        {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter elements to push into stack");
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            s.push(sc.nextInt());
        }
        System.out.println("Enter data to be pushed to the bottom:");
        int x = sc.nextInt();
        pushAtBottom(x, s);
        System.out.println("New Stack:\n" + s);
        reverse(s);
        System.out.println("\nReversed Stack:\n" + s);
        sc.close();
    }
}