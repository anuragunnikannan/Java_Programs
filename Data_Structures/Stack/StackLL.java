import java.util.*;
public class StackLL
{
    Node head;
    int top;
    StackLL()
    {
        top = 0;
    }

    public class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public boolean isEmpty()
    {
        if(head == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void push(int x)
    {
        Node newNode = new Node(x);
        top++;
        if(isEmpty())
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    public int pop()
    {
        int r;
        if(isEmpty())
        {
            System.out.println("Underflow");
            r = -99999;
        }
        else
        {
            r = head.data;
            head = head.next;
            top--;
        }
        return r;
    }

    public void display()
    {
        Node currNode = head;
        while(currNode != null)
        {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StackLL st = new StackLL();
        while(true)
        {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("\nEnter your choice: ");
            int c = sc.nextInt();
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