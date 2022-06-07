import java.util.*;
public class LLPalindrome
{
	Node head;
	int size;
	LLPalindrome()
	{
		size = 0;
	}
	public class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	public void insert(int item)
	{
		Node newNode = new Node(item);
		size++;
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

	/* public void checkPalindrome()
	{
		String s = "", r = "";
		Node currNode = head;
		while(currNode != null)
		{
			s = s + Integer.toString(currNode.data);
			r = Integer.toString(currNode.data) + r;
			currNode = currNode.next;
		}
		if(s.equals(r))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	} */
    
    public Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public Node findMiddle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public void checkPalindrome()
    {
        if(head == null || head.next == null)
        {
            System.out.println("Palindrome");
        }
        else
        {
            Node firstHalfStart = head;
            Node firstHalfEnd = findMiddle(head);
            Node secondHalfStart = reverse(firstHalfEnd.next);
            while(secondHalfStart != null)
            {
                if(firstHalfStart.data != secondHalfStart.data)
                {
                    System.out.println("Not Palindrome");
                    return;
                }
                firstHalfStart = firstHalfStart.next;
                secondHalfStart = secondHalfStart.next;
            }
            System.out.println("Palindrome");
        }
    }

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of linked list");
        int n = sc.nextInt();
		System.out.println("Enter elements for linked list");
		LLPalindrome ll = new LLPalindrome();
		for(int i = 0; i < n; i++)
		{
			ll.insert(sc.nextInt());
		}
		ll.checkPalindrome();
		sc.close();
	}
}