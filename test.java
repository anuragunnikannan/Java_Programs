import java.io.*;
class Vehicle
{
    protected int regNumber;
    protected int speed;
    protected String color;
    protected String ownerName;
    Vehicle(int r, int s, String c, String o)
    {
        regNumber = r;
        speed = s;
        color = c;
        ownerName = o;
    }
    void showData()
    {
        System.out.println("Registration Number:"+regNumber);
        System.out.println("Speed: "+speed);
        System.out.println("Color: "+color);
        System.out.println("Owner Name: "+ownerName);
    }
}
class Bus extends Vehicle
{
    private int routeNumber;
    Bus(int r, int s, String c, String o, int rn)
    {
        super(r, s, c, o);
        routeNumber = rn;
    }
    void showData()
    {
        super.showData();
        System.out.println("Route Number: "+routeNumber);
    }
}

class Car extends Vehicle
{
    private String manufacturerName;
    Car(int r, int s, String c, String o, String m)
    {
        super(r, s, c, o);
        manufacturerName = m;
    }
    void showData()
    {
        super.showData();
        System.out.println("Manufacturer Name: "+manufacturerName);
    }
}

public class test
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter reg no.: ");
        int reg = Integer.parseInt(br.readLine());
        System.out.println("Enter speed: ");
        int speed = Integer.parseInt(br.readLine());
        System.out.println("Enter color: ");
        String color = br.readLine();
        System.out.println("Enter owner name: ");
        String owner = br.readLine();
        System.out.println("1. Bus");
        System.out.println("2. Car");
        System.out.println("\nEnter your choice: ");
        int c = Integer.parseInt(br.readLine());
        switch(c)
        {
            case 1:
            System.out.println("Enter route no.: ");
            int route = Integer.parseInt(br.readLine());
            Bus bu = new Bus(reg, speed, color, owner, route);
            bu.showData();
            break;
            case 2:
            System.out.println("Enter manufacturer name: ");
            String mname = br.readLine();
            Car ca = new Car(reg, speed, color, owner, mname);
            ca.showData();
            break;
            default:
            System.out.println("Invalid Choice!");
        }
    }
}