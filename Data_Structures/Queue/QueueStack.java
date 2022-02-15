import java.util.*;
public class QueueStack
{
    Stack<Integer> st1 = new Stack<Integer>();
    Stack<Integer> st2 = new Stack<Integer>();

    public void insert(int data)
    {
        st1.push(data);
    }

    public int remove()
    {
        int r;
        if(st1.isEmpty())
        {
            System.out.println("Underflow");
            return -99999;
        }
        else
        {
            while(!st1.isEmpty())
            {
                st2.push(st1.pop());
            }
            r = st2.pop();
            while(!st2.isEmpty())
            {
                st1.push(st2.pop());
            }
            return r;
        }
    }

    public void display()
    {
        if(st1.isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            Iterator<Integer> it = st1.iterator();
            while(it.hasNext())
            {
                System.out.print(it.next()+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        QueueStack qu = new QueueStack();
        int c;
        while(true)
        {
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("\nEnter your choice: ");
            c = sc.nextInt();
            switch(c)
            {
                case 1:
                System.out.println("Enter data to insert:");
                int x = sc.nextInt();
                qu.insert(x);
                qu.display();
                break;
                case 2:
                int r = qu.remove();
                if(r != -99999)
                {
                    System.out.println(r+" has been removed");
                }
                qu.display();
                break;
                case 3:
                qu.display();
                break;
                case 4:
                System.exit(0);
                default:
                System.out.println("Invalid Choice");
            }
        }
    }
}