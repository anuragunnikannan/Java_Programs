import java.util.*;
interface A
{
    int x = 35;
    int y = 24;
    abstract int add(int x, int y);
    abstract int subtract(int x, int y);
}

class C1 implements A
{
    public int add(int x, int y)
    {
        return x+y;
    }
    public int subtract(int x, int y)
    {
        return x-y;
    }
}

public class Demo3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter another number: ");
        int y = sc.nextInt();
        C1 obj = new C1();
        System.out.println("Sum = "+obj.add(x, y));
        System.out.println("Difference = "+obj.subtract(x, y));
    }
}