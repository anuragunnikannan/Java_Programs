import java.util.*;
class StackArray
{
    int s[];
    int top, n;
    StackArray(int nn)   //Constructor to initialize  global variables
    {
        n = nn;
        s = new int[n];
        for(int i = 0;i<n;i++)
        {
            s[i] = 0;   //Initializing stack array with 0
        }
        top = -1;
    }

    public void push(int data)
    {
        if(top==(n-1))  //Checking for overflow
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            s[top] = data;  //Pushing data to stack
        }
    }

    public int pop()
    {
        int deleted_data;
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return -99999;
        }
        else
        {
            deleted_data = s[top];  //Storing deleted element in another variable
            System.out.println(deleted_data+" popped");
            top--;  //Deleting the topmost element
            return deleted_data;
        }
    }

    public void display()
    {
        if(top!=-1)
        {
            System.out.println("\nStack: ");
            for(int i = top;i>=0;i--)
            {
                System.out.println(s[i]);
            }
        }
        else
        {
            System.out.println("Stack Empty");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        int n = sc.nextInt();
        StackArray st = new StackArray(n);
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
                int r = st.pop();
                if(r != -99999)
                {
                    System.out.println(r+" has been removed");
                }
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
