import java.util.*;
interface Add_Sub
{
    public void add(int a, int b);
    public void sub(int a, int b);
}

interface Mul_Div
{
    public void mul(int a, int b);
    public void div(int a, int b);
}

interface Calculator extends Add_Sub, Mul_Div
{
    public void display(double r);
}

public class MyCalculator implements Calculator
{
    public void add(int a, int b)
    {
        double sum = a+b;
        display(sum);
    }
    public void sub(int a, int b)
    {
        double difference = a-b;
        display(difference);
    }
    public void mul(int a, int b)
    {
        double product = a*b;
        display(product);
    }
    public void div(int a, int b)
    {
        double quotient = (double)a/b;
        display(quotient);
    }
    public void display(double r)
    {
        System.out.println("Result = "+r);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        MyCalculator ca = new MyCalculator();
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("\nEnter your choice: ");
        int c = sc.nextInt();
        System.out.println("\nEnter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        switch(c)
        {
            case 1:
            ca.add(a, b);
            break;
            case 2:
            ca.sub(a, b);
            break;
            case 3:
            ca.mul(a, b);
            break;
            case 4:
            ca.div(a, b);
            break;
            default:
            System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}