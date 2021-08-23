import java.io.*;
class Student5
{
    int roll;
    String name;
    public void getRoll_Name()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter roll no.: ");
        roll = Integer.parseInt(br.readLine());
        System.out.println("Enter name: ");
        name = br.readLine();
    }
    public void displayRoll_Name()
    {
        System.out.println("Roll No.: "+roll);
        System.out.println("Name: "+name);
    } 
}

class Exam extends Student5
{
    int marks[];
    public int[] getMarks()throws IOException
    {
        getRoll_Name();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        marks = new int[6];
        System.out.println("Enter marks in 6 subjects:");
        for(int i = 0;i<6;i++)
        {
            marks[i] = Integer.parseInt(br.readLine());
        }
        return marks;
    }
    public void displayMarks()
    {
        displayRoll_Name();
        for(int i = 0;i<6;i++)
        {
            System.out.println("Marks in "+(i+1)+": "+marks[i]);
        }
    }
}

class Result extends Exam
{
    int total;
    public void getResult()throws IOException
    {
        int m[] = getMarks();
        total = 0;
        for(int i = 0;i<6;i++)
        {
            total = total + m[i];
        }
    }
    public void display()
    {
        displayMarks();
        System.out.println("Total Marks: "+total);
    }
}

public class Main
{
    public static void main(String args[])throws IOException
    {
        Result re = new Result();
        re.getResult();
        re.display();
    }
}