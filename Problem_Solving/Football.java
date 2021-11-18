import java.io.*;
public class Football
{
    public static void sort(String teams[], int matches[], int gf[], int ga[], int gd[], int points[], int j)
    {
        String temp1 = teams[j];
        teams[j] = teams[j+1];
        teams[j+1] = temp1;
        int temp2 = points[j];
        points[j] = points[j+1];
        points[j+1] = temp2;
        int temp3 = matches[j];
        matches[j] = matches[j+1];
        matches[j+1] = temp3;
        int temp4 = gf[j];
        gf[j] = gf[j+1];
        gf[j+1] = temp4;z
        int temp5 = ga[j];
        ga[j] = ga[j+1];
        ga[j+1] = temp5;
        int temp6 = gd[j];
        gd[j] = gd[j+1];
        gd[j+1] = temp6;
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of teams:");
        int n = Integer.parseInt(br.readLine());
        String teams[] = new String[n];
        System.out.println("Enter team names:");
        for(int i = 0;i<n;i++)
        {
            teams[i] = br.readLine();
        }
        System.out.println("Enter number of matches:");
        int m = Integer.parseInt(br.readLine());
        int matches[] = new int[n];
        int gf[] = new int[n];
        int ga[] = new int[n];
        int gd[] = new int[n];
        int points[] = new int[n];
        System.out.println("Enter match details:");
        for(int i = 0;i<m;i++)
        {
            String t[] = new String[4];
            for(int j = 0;j<4;j++)
            {
                t[j] = br.readLine();
            }
            int flag = 0;
            int c1 = 0, c2 = 0;
            if(!t[0].equalsIgnoreCase(t[1]))
            {
                for(int j = 0;j<n;j++)
                {
                    if(t[0].equalsIgnoreCase(teams[j]))
                    {
                        flag++;
                        c1 = j;
                    }
                    if(t[1].equalsIgnoreCase(teams[j]))
                    {
                        flag++;
                        c2 = j;
                    }
                }
            }
            if(flag != 2)
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            else
            {
                matches[c1]++;
                matches[c2]++;
                gf[c1] += Integer.parseInt(t[2]);
                ga[c1] += Integer.parseInt(t[3]);
                gf[c2] += Integer.parseInt(t[3]);
                ga[c2] += Integer.parseInt(t[2]);
                gd[c1] += gf[c1] - ga[c1];
                gd[c2] += gf[c2] - ga[c2];
                if(Integer.parseInt(t[2]) > Integer.parseInt(t[3]))
                {
                    points[c1] += 2;
                }
                else if(Integer.parseInt(t[3]) > Integer.parseInt(t[2]))
                {
                    points[c2] += 2;
                }
                else
                {
                    points[c1]++;
                    points[c2]++;
                }
            }
        }
        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                if(points[j] < points[j+1])
                {
                    sort(teams, matches, gf, ga, gd, points, j);
                }
                else if(points[j] == points[j+1])
                {
                    if(gd[j] < gd[j+1])
                    {
                        sort(teams, matches, gf, ga, gd, points, j);
                    }
                    else if(gd[j] == gd[j+1])
                    {
                        if(gf[j] < gf[j+1])
                        {
                            sort(teams, matches, gf, ga, gd, points, j);
                        }
                        else if(gf[j] == gf[j+1])
                        {
                            if(teams[j].compareTo(teams[j+1]) > 0)
                            {
                                sort(teams, matches, gf, ga, gd, points, j);
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0;i<n;i++)
        {
            System.out.println(teams[i]);
        }
    }
}