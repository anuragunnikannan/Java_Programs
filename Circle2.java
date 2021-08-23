class Point
{
    int x1, x2, y1, y2;
    public Point()
    {
        x1 = 5;
        y1 = 2;
        x2 = 14;
        y2 = 9;
    }
}
public class Circle2
{
    public static void main(String args[])
    {
        Point po = new Point();
        double radius = (Math.pow((po.x2-po.x1), 2) - Math.pow((po.y2-po.y1), 2));
        double area = 3.14*Math.pow(radius, 2);
        System.out.println("Area is "+area);
    }
}