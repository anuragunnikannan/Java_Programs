import java.util.*;
public class StackCFExample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        int c;
        while(true)
        {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("\nEnter your choice: ");
            c = sc.nextInt();
            switch(c)
            {
                case 1:
                System.out.println("Enter data to be pushed: ");
                int x = sc.nextInt();
                st.push(x);
                System.out.println(st);
                break;
                case 2:
                st.pop();
                System.out.println(st);
                break;
                case 3:
                System.out.println(st);
                break;
                case 4:
                System.out.println("Program Ends");
                System.exit(0);
                break;
                default:
                System.out.println("Invalid Choice");
            }
        }
    }
}