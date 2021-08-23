import java.util.*;
class Distance
{
    double miles;
    public void getDist()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance:");
        miles = sc.nextDouble();
    }
    public void travelTime()
    {
        double time = miles/60;
        System.out.println("Time taken: "+time);
    }
}

class DistanceMKS extends Distance
{
    public void travelTime()
    {
        getDist();
        double km = miles*1.60934;
        double time = km/100;
        System.out.println("Time Taken: "+time);
    }
}

public class Working6
{
    public static void main(String args[])
    {
        DistanceMKS dm = new DistanceMKS();
        dm.travelTime();
    }
}