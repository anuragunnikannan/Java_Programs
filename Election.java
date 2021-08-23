import java.util.*;
class Election
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count[] = {0, 0, 0, 0, 0};
        int spoilt_ballot = 0;
        while(true)
        {
            System.out.println("Enter candidate number from 1-5: ");
            int n = sc.nextInt();
            if(n<=0 || n>=6)
            {
                spoilt_ballot++;
            }
            else
            {
                count[n-1]++;
                System.out.println("Do you want to continue? (y/n)");
                char x = sc.next().charAt(0);
                if(x=='y')
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
        }
        for(int i = 0;i<5;i++)
        {
            System.out.println("Candidate "+(i+1)+": "+count[i]+" votes");
        }
        sc.close();
    }
}