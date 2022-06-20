import java.util.*;
public class AddLinkedList
{
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
    
    public Node createLinkedList(String n)
    {
        Node newNode = new Node(Character.getNumericValue(n.charAt(0)));
        Node curr = newNode;
        for(int i = 1; i < n.length(); i++)
        {
            curr.next = new Node(Character.getNumericValue(n.charAt(i)));
            curr = curr.next;
        }
        return newNode;
    }
    
    public String extract(Node head)
    {
        Node curr = head;
        String n = "";
        while(curr != null)
        {
            n = n + curr.data;
            curr = curr.next;
        }
        return n;
    }
    
    public void print(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        String n1 = sc.nextLine();
        System.out.println("Enter num2:");
        String n2 = sc.nextLine();
        AddLinkedList all = new AddLinkedList();
        Node a = all.createLinkedList(n1);
        Node b = all.createLinkedList(n2);
        all.print(all.createLinkedList(Integer.toString(Integer.valueOf(all.extract(a)) + Integer.valueOf(all.extract(b)))));
        sc.close();
    }
}