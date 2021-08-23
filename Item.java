import java.io.*;
public class Item
{
    String code;
    int price;
    public Item(String c, int p)
    {
        code = c;
        price = p;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Item it[] = new Item[5];
        int total = 0;
        for(int i = 0;i<5;i++)
        {
            System.out.println("Enter code and price of item "+(i+1)+":");
            String c = br.readLine();
            int p = Integer.parseInt(br.readLine());
            it[i] = new Item(c, p);
            total = total+it[i].price;
        }
        System.out.println("Code\tPrice");
        for(int i = 0;i<5;i++)
        {
            System.out.println(it[i].code+"\t"+it[i].price);
        }
        System.out.println("Total = "+total);
    }
}