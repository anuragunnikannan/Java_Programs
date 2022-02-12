import java.util.*;
public class CircularQueue
{
    int Q[];
    int front;
    int rear;
    int n;
    CircularQueue(int nn)
    {
        n = nn;
        Q = new int[n];
        front = -1;
        rear = -1;
        for(int i = 0; i < n; i++)
        {
            Q[i] = 0;
        }
    }

    public boolean isEmpty()
    {
        if(front == -1 && rear == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isFull()
    {
        if((rear + 1) % n == front)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void insert(int item)    //O(1)
    {
        if(isFull())
        {
            System.out.println("Overflow");
            return;
        }
        else if(front == -1)        //For inserting 1st element
        {
            front = 0;
            rear = 0;
        }
        else
        {
            rear = (rear + 1) % n;
        }
        Q[rear] = item;
    }

    public int remove()     //O(1)
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
            return -99999;
        }
        int item = Q[front];
        if(front == rear)   //If only 1 element is left
        {
            front = -1;
            rear = -1;
        }
        else
        {
            front = (front + 1) % n;
        }
        return item;
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        else
        {
            int i = front;
            while(i != rear)
            {
                System.out.print(Q[i] + " ");
                i = (i + 1) % n;
            }
            System.out.println(Q[i]);   //For cases if only 1 element is present
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of circular queue:");
        int n = sc.nextInt();
        CircularQueue cq = new CircularQueue(n);
        int choice;
        while(true)
        {
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter data to insert:");
                int x = sc.nextInt();
                cq.insert(x);
                cq.display();
                break;
                case 2:
                int r = cq.remove();
                if(r != -99999)
                    System.out.println(r+" has been removed");
                cq.display();
                break;
                case 3:
                cq.display();
                break;
                case 4:
                System.exit(0);
                default:
                System.out.println("Invalid Choice");
            }
        }
    }
}