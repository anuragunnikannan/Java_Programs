import java.util.*;
abstract class Shape
{
    abstract public void perimeter(int s1, int s2);
    abstract public void area(int s1, int s2);
}

class Rectangle extends Shape
{
    public void perimeter(int s1, int s2)
    {
        int perimeter = 2*(s1+s2);
        System.out.println("Perimeter of Rectangle = "+perimeter);
    }
    public void area(int s1, int s2)
    {
        int area = s1*s2;
        System.out.println("Area of Rectangle = "+area);
    }
}

class Triangle extends Shape
{
    public void perimeter(int s1, int s2)
    {
        double perimeter = s1 + s2 + Math.sqrt(Math.pow(s1, 2)+Math.pow(s2, 2));
        System.out.println("Perimeter of Triangle = "+perimeter);
    }
    public void area(int s1, int s2)
    {
        double area = 0.5*s1*s2;
        System.out.println("Area of Triangle = "+area);
    }
}

public class Shape_Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("\nEnter your choice: ");
        int c = sc.nextInt();
        System.out.println("Enter side 1: ");
        int s1 = sc.nextInt();
        System.out.println("Enter side 2: ");
        int s2 = sc.nextInt();
        switch(c)
        {
            case 1:
            Rectangle re = new Rectangle();
            re.perimeter(s1, s2);
            re.area(s1, s2);
            break;
            case 2:
            Triangle tr = new Triangle();
            tr.perimeter(s1, s2);
            tr.area(s1, s2);
            break;
            default:
            System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}