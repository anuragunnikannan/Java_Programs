import java.util.*;
class Queue
{
    int Q[];
    int front;
    int rear;
    int n;
    Queue(int nn)
    {
        n = nn;
        Q = new int[n];
        front = rear = -1;
        for(int i = 0;i<n;i++)
        {
            Q[i] = 0;
        }
    }

    public void insert(int data)
    {
        if(front==-1)       //For beginning of Queue
        {
            rear = 0;
            front = 0;
            Q[rear] = data;
        }
        else if((rear-front) < n-1) 
        {
            Q[++rear] = data;
        }
        else
        {
            System.out.println("Queue Overflow");
        }
    }

    public void remove()
    {
        int rem;
        if(front==-1 ||front>rear)
        {
            System.out.println("Queue Underflow");
        }
        else
        {
            rem = Q[front];
            System.out.println(rem+" removed");
            front++;
        }
    }

    public void display()
    {
        System.out.println("Queue:");
        if(front==-1 || front>rear)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            for(int i = front;i<=rear;i++)
            {
                System.out.print(Q[i]+" ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue: ");
        int n = sc.nextInt();
        Queue qu = new Queue(n);
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
                qu.remove();
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