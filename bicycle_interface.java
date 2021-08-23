interface Bicycle
{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle
{
    void blowHorn1();
    void blowHorn2();
}

class AvonCycle implements Bicycle, HornBicycle
{
    void blowHorn()
    {
        System.out.println("Beep Beep!");
    }
    public void applyBrake(int decrement)
    {
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment)
    {
        System.out.println("Applying SpeedUp");
    }
    public void blowHorn1()
    {
        System.out.println("Horn1");
    }
    public void blowHorn2()
    {
        System.out.println("Horn2");
    }
}

public class bicycle_interface
{
    public static void main(String args[])
    {
        AvonCycle ac = new AvonCycle();
        ac.applyBrake(1);
        System.out.println(Bicycle.a);
        ac.blowHorn1();
        ac.blowHorn2();
    }
}