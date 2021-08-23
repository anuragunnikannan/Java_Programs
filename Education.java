import java.io.*;
class Staff
{
    String code, name;
    public void getStaff()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter code:");
        code = br.readLine();
        System.out.println("Enter name: ");
        name = br.readLine();
    }
    public void displayStaff()
    {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
    }
}

class Teacher extends Staff
{
    String subject, publication;
    public void getTeacher()throws IOException
    {
        getStaff();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter subject:");
        subject = br.readLine();
        System.out.println("Enter publication: ");
        publication = br.readLine();
    }
    public void displayTeacher()
    {
        displayStaff();
        System.out.println("Subject: "+subject);
        System.out.println("Publication: "+publication);
    }
}

class Officer extends Staff
{
    String grade;
    public void getOfficer()throws IOException
    {
        getStaff();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter grade:");
        grade = br.readLine();
    }
    public void displayOfficer()
    {
        displayStaff();
        System.out.println("Grade: "+grade);
    }
}

class Typist extends Staff
{
    int speed;
    public void getTypist()throws IOException
    {
        getStaff();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter speed:");
        speed = Integer.parseInt(br.readLine());
    }
    public void displayTypist()
    {
        displayStaff();
        System.out.println("Speed: "+speed);
    }
}

class RegularTypist extends Typist
{
    int remuneration;
    public void getRegularTypist()throws IOException
    {
        getTypist();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter remuneration: ");
        remuneration = Integer.parseInt(br.readLine());
    }
    public void displayRegularTypist()
    {
        displayTypist();
        System.out.println("Remnuneration: "+remuneration);
    }
}

class CasualTypist extends Typist
{
    int dailywages;
    public void getCasualTypist()throws IOException
    {
        getTypist();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter daily wages: ");
        dailywages = Integer.parseInt(br.readLine());
    }
    public void displayCasualTypist()
    {
        displayTypist();
        System.out.println("Daily Wages: "+dailywages);
    }
}

public class Education
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Teacher Details");
        System.out.println("2. Typist Details");
        System.out.println("3. Officer Details");
        System.out.println("\nEnter your choice: ");
        int c = Integer.parseInt(br.readLine());
        switch(c)
        {
            case 1:
            System.out.println("TEACHER DETAILS");
            Teacher te = new Teacher();
            te.getTeacher();
            te.displayTeacher();
            break;
            case 2:
            System.out.println("1. Regular Typist");
            System.out.println("2. Casual Typist");
            System.out.println("\nEnter your choice: ");
            int x = Integer.parseInt(br.readLine());
            System.out.println("TYPIST DETAILS");
            if(x==1)
            {
                CasualTypist ct = new CasualTypist();
                ct.getCasualTypist();
                ct.displayCasualTypist();
            }
            else if(x==2)
            {
                RegularTypist rt = new RegularTypist();
                rt.getRegularTypist();
                rt.displayRegularTypist();
            }
            else
            {
                System.out.println("Invalid Choice!");
            }
            break;
            case 3:
            System.out.println("OFFICER DETAILS");
            Officer of = new Officer();
            of.getOfficer();
            of.displayOfficer();
            break;
            default:
            System.out.println("Invalid Choice!");
        }
    }
}