import java.util.*;
public class StackQueue
{
    Queue<Integer> Q1 = new LinkedList<Integer>();
    Queue<Integer> Q2 = new LinkedList<Integer>();

    public void push(int data)
    {
        if(Q1.isEmpty())
        {
            Q1.add(data);
        }
        else
        {
            while(!Q1.isEmpty())
            {
                Q2.add(Q1.remove());
            }
            Q1.add(data);
            while(!Q2.isEmpty())
            {
                Q1.add(Q2.remove());
            }
        }
    }

    public int pop()
    {
        if(!Q1.isEmpty())
        {
            int data = Q1.peek();
            Q1.remove();
            return data;
        }
        else
        {
            System.out.println("Underflow");
            return -99999;
        }
    }

    public void display()
    {
        Iterator<Integer> itr = Q1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next() + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StackQueue st = new StackQueue();
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
                st.display();
                break;
                case 2:
                st.pop();
                st.display();
                break;
                case 3:
                st.display();
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