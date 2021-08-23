import java.io.*;
public class Tender
{
    int cost;
    String company_name;
    public Tender(int c, String cn)
    {
        cost = c;
        company_name = cn;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = 0, m = 0;
        Tender te[] = new Tender[5];
        for(int i = 0;i<5;i++)
        {
            System.out.println("Enter cost of company"+(i+1)+":");
            int c = Integer.parseInt(br.readLine());
            System.out.println("Enter company name: ");
            String cn = br.readLine();
            te[i] = new Tender(c, cn);
        }
        m = te[0].cost;
        for(int i = 0;i<5;i++)
        {
            if(te[i].cost < m)
            {
                m = te[i].cost;
                p = i;
            }
        }
        System.out.println("Company with minimum cost: "+te[p].company_name);
    }
}