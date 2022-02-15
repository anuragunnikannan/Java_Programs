import java.util.*;
public class QueueLL
{
    Node head;
    public class Node
    {
        int data;
        Node next;
        public Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node currNode = head;
            while(currNode.next != null)
            {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    public int remove()
    {
        if(head == null)
        {
            System.out.println("Underflow");
            return -99999;
        }
        else
        {
            int r = head.data;
            head = head.next;
            return r;
        }
    }

    public void display()
    {
        if(head == null)
        {
            System.out.println("Empty");
        }
        else
        {
            Node currNode = head;
            while(currNode != null)
            {
                System.out.print(currNode.data+" ");
                currNode = currNode.next;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        QueueLL qu = new QueueLL();
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