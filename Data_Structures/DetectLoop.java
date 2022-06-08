/*
    This algorithm is known as Floyd's Cycle Finding Algorithm, and it is the fastest method.
*/
import java.util.*;
public class DetectLoop
{
    Node head;
    public class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    public void insert(int item)
    {
        Node newNode = new Node(item);
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
    
    public void detect()
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                System.out.println("Loop Detected");
                remove(slow, head);
                return;
            }
        }
        System.out.println("Loop not detected");
    }
    
    public void remove(Node slow, Node head)
    {
        Node ptr1 = slow, ptr2 = head;
        while(ptr1.next != ptr2.next)
        {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr1.next = null;
        System.out.println("Loop removed");
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        DetectLoop dl = new DetectLoop();
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            dl.insert(sc.nextInt());
        }
        //Intentionally creating a loop for testing
        dl.head.next.next.next = dl.head.next;
        
        dl.detect();
        dl.detect();
        sc.close();
    }
}
