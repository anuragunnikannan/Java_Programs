import java.util.*;
class Cube
{
    public double surfaceArea(double side)
    {        
        return 6*side*side;
    }
    public double volume(double side)
    {
        return side*side*side;
    }
}

class Cylinder
{
    public double surfaceArea(double radius, double height)
    {
        return 2*3.14*radius*height + 2*3.14*radius*radius;
    }
    public double volume(double radius, double height)
    {
        return 3.14*radius*radius*height;
    }
}

class Cone
{
    public double surfaceArea(double radius, double height)
    {
        return 3.14*radius*(radius + Math.sqrt(height*height + radius*radius));
    }
    public double volume(double radius, double height)
    {
        return 0.33333*3.14*radius*radius*height;
    }
}

public class ThreeDObject
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Cube cu = new Cube();
        Cylinder cy = new Cylinder();
        Cone co = new Cone();
        System.out.println("1. Cube");
        System.out.println("2. Cylinder");
        System.out.println("3. Cone");
        System.out.println("\nEnter your choice: ");
        int c = sc.nextInt();
        double side, radius, height;
        switch(c)
        {
            case 1:
            System.out.println("Enter side of cube: ");
            side = sc.nextDouble();
            System.out.println("Surface Area = "+cu.surfaceArea(side));
            System.out.println("Volume = "+cu.volume(side));
            break;
            case 2:
            System.out.println("Enter radius and height of cylinder respectively: ");
            radius = sc.nextDouble();
            height = sc.nextDouble();
            System.out.println("Surface Area = "+cy.surfaceArea(radius, height));
            System.out.println("Volume = "+cy.volume(radius, height));
            break;
            case 3:
            System.out.println("Enter radius and height of cone respectively: ");
            radius = sc.nextDouble();
            height = sc.nextDouble();
            System.out.println("Surface Area = "+co.surfaceArea(radius, height));
            System.out.println("Volume = "+co.volume(radius, height));
            break;
            default:
            System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}