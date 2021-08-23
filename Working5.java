import java.io.*;
class Num2
{
    int n;
    public void showNum()
    {
        System.out.println("Decimal Number: "+n);
    }
}

class OctNum1 extends Num2
{
    public void getNum()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        n = Integer.parseInt(br.readLine());
    }
    public void showNum()
    {
        super.showNum();
        System.out.println("Octal Number: "+Integer.toOctalString(n));
    }
}

class HexNum1 extends Num2
{
    public void getNum()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        n = Integer.parseInt(br.readLine());
    }
    public void showNum()
    {
        super.showNum();
        System.out.println("Hexadecimal Number: "+Integer.toHexString(n));
    }
}

public class Working5
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Octal Number");
        System.out.println("2. Hexadecimal Number");
        System.out.println("Enter your choice: ");
        int c = Integer.parseInt(br.readLine());
        switch(c)
        {
            case 1:
            OctNum1 on = new OctNum1();
            on.getNum();
            on.showNum();
            break;
            case 2:
            HexNum1 hn = new HexNum1();
            hn.getNum();
            hn.showNum();
            break;
            default:
            System.out.println("Invalid Choice!");
        }
    }
}