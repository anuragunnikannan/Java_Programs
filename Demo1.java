import java.util.*;
class Grader
{
    int score;
    Grader(int s)
    {
        score = s;
    }
    public char letterGrade(int s)
    {
        if(s>=90)
        {
            return 'O';
        }
        else if(s>=80)
        {
            return 'E';
        }
        else if(s>=70)
        {
            return 'A';
        }
        else if(s>=60)
        {
            return 'B';
        }
        else if(s>=50)
        {
            return 'C';
        }
        else
        {
            return 'F';
        }
    }
}

public class Demo1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score:");
        int score = sc.nextInt();
        if(score < 0 || score >100)
        {
            System.out.println("Invalid Score");
            System.exit(0);
        }
        Grader gr = new Grader(score);
        System.out.println("Grade = "+gr.letterGrade(score));
        sc.close();
    }
}