import java.io.*;
class Num
{
    int n;
    public void showNum()
    {
        System.out.println("Decimal Number: "+n);
    }
}

class HexNum extends Num
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

public class Working3
{
    public static void main(String args[])throws IOException
    {
        HexNum hn = new HexNum();
        hn.getNum();
        hn.showNum();
    }
}