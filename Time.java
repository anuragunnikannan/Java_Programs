import java.util.*;
public class Time
{
    private int hours, minutes, seconds;
    public Time(int h, int m, int s)
    {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }
    public void add(Time t)
    {
        //adding 1 hours 30 minutes and 45 seconds
        int s = (t.seconds + 45) % 60;
        int m = (t.minutes + s/60 + 30) % 60;
        int h = (t.hours + m/60 + 1);
        System.out.println(h+":"+m+":"+s);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Time1\n");
        System.out.println("Enter hours: ");
        int h = sc.nextInt();
        System.out.println("Enter minutes: ");
        int m = sc.nextInt();
        System.out.println("Enter seconds: ");
        int s = sc.nextInt();
        Time ti = new Time(h, m, s);
        System.out.println("Time2\n");
        System.out.println("Enter hours: ");
        int h1 = sc.nextInt();
        System.out.println("Enter minutes: ");
        int m1 = sc.nextInt();
        System.out.println("Enter seconds: ");
        int s1 = sc.nextInt();
        Time ti1 = new Time(h1, m1, s1);
        ti.add(ti);
        ti1.add(ti1);
        sc.close();
    }
}
