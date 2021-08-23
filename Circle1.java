import java.util.*;
public class Circle1
{
    double radius;
    String color;
    public Circle1()
    {
        radius = 1.0;
        color = "red";
    }
    public Circle1(double r, String c)
    {
        radius = r;
        color = c;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return 3.14*Math.pow(radius, 2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter color: ");
        String c = sc.nextLine();
        Circle1 ci = new Circle1(r, c);
        System.out.println("Radius = "+ci.getRadius());
        System.out.println("Area = "+ci.getArea());
        sc.close();
    }
}