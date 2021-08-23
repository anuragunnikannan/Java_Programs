import java.io.*;
class Num1
{
    int n;
    public void showNum()
    {
        System.out.println("Decimal Number: "+n);
    }
}

class OctNum extends Num1
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

public class Working4
{
    public static void main(String args[])throws IOException
    {
        OctNum on = new OctNum();
        on.getNum();
        on.showNum();
    }
}