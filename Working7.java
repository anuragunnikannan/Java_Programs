import java.io.*;
class Vehicle2
{
    int wheels;
    int speed;
    public void getDetails()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of wheels: ");
        wheels = Integer.parseInt(br.readLine());
        System.out.println("Enter speed: ");
        speed = Integer.parseInt(br.readLine());
    }
    public void displayDetails()
    {
        System.out.println("Wheels: "+wheels);
        System.out.println("Speed: "+speed);
    }
}

class Car1 extends Vehicle2
{
    int passengers;
    public void getDetails()throws IOException
    {
        super.getDetails();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of passengers: ");
        passengers = Integer.parseInt(br.readLine());
    }
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Passengers: "+passengers);
    }
}

class Truck extends Vehicle2
{
    int load;
    public void getDetails()throws IOException
    {
        super.getDetails();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter load limit: ");
        load = Integer.parseInt(br.readLine());
    }
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Load Limit: "+load);
    }
}

public class Working7
{
    public static void main(String args[])throws IOException
    {
        Car1 ca = new Car1();
        ca.getDetails();
        ca.displayDetails();
        Truck tr = new Truck();
        tr.getDetails();
        tr.displayDetails();
        if(tr.speed>ca.speed)
        {
            System.out.println("Truck is faster");
        }
        else
        {
            System.out.println("Car is faster");
        }
    }
}