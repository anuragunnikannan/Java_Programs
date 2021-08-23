import java.io.*;
class Student2
{
    int reg_number;
    String name;
    char section;
    int roll_number;
    int year;
    double cgpa;
    String course;
    public Student2(int reg_number, String name, char section, int roll_number, int year, double cgpa, String course)
    {
        this.reg_number = reg_number;
        this.name = name;
        this.section = section;
        this.roll_number = roll_number;     //Initializing data members
        this.year = year;
        this.cgpa = cgpa;
        this.course = course;
    }
}

class Details1
{
    public boolean isDuplicateReg(Student2 arr[], int reg)
    {
        int flag = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]!=null && reg==arr[i].reg_number)
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isDuplicateSec(Student2 arr[], int ro, char sec, int year)
    {
        int flag = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]!=null && arr[i].roll_number==ro && arr[i].section==sec && arr[i].year==year)
            {
                flag = 1;
            }
        }
        if(flag==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void displayAllDetails(Student2 arr[])
    {
        System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "RegNo", "Name", "Section", "RollNo", "Year", "CGPA", "Course");
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]!=null)
            {
                System.out.printf("\n%-20d%-20s%-20c%-20d%-20d%-20f%-20s", arr[i].reg_number, arr[i].name, arr[i].section, arr[i].roll_number, arr[i].year, arr[i].cgpa, arr[i].course);
            }
        }
    }

    public void displayByYear(Student2 arr[], int year)
    {
        System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "RegNo", "Name", "Section", "RollNo", "Year", "CGPA", "Course");
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]!=null && arr[i].year==year)
            {
                System.out.printf("\n%-20d%-20s%-20c%-20d%-20d%-20f%-20s", arr[i].reg_number, arr[i].name, arr[i].section, arr[i].roll_number, arr[i].year, arr[i].cgpa, arr[i].course);
            }
        }
    }

    public void displayByCourse(Student2 arr[], String co)
    {
        System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "RegNo", "Name", "Section", "RollNo", "Year", "CGPA", "Course");
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]!=null && arr[i].course.equalsIgnoreCase(co)==true)
            {
                System.out.printf("\n%-20d%-20s%-20c%-20d%-20d%-20f%-20s", arr[i].reg_number, arr[i].name, arr[i].section, arr[i].roll_number, arr[i].year, arr[i].cgpa, arr[i].course);
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Student2 arr[] = new Student2[100];
        Details1 de = new Details1();
        int c = 1;
        int i = 0;
        int reg, roll, year;
        String name, co;
        char sec;
        double cg;
        while(c!=5)
        {
            System.out.println("\n1. Add Student Details");
            System.out.println("2. Display Students studying in a Year");
            System.out.println("3. Display Students studying a Course");
            System.out.println("4. Display All Details");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            c = Integer.parseInt(br.readLine());
            switch(c)
            {
                case 1:
                char c1 = 'y';
                while(c1!='n')
                {
                    System.out.println("\nEnter registration number: ");
                    reg = Integer.parseInt(br.readLine());
                    if(de.isDuplicateReg(arr, reg)==true)
                    {
                        System.out.println("This registration number already exists. Try again!");
                        continue;
                    }
                    System.out.println("Enter name: ");
                    name = br.readLine();
                    System.out.println("Enter section: ");
                    sec = (char)br.read();
                    br.readLine();
                    System.out.println("Enter roll number: ");
                    roll = Integer.parseInt(br.readLine());
                    System.out.println("Enter year: ");
                    year = Integer.parseInt(br.readLine());
                    if(de.isDuplicateSec(arr, roll, sec, year)==true)
                    {
                        System.out.println("This roll number for section "+sec+" year "+year+" already exists. Try again!");
                        continue;
                    }
                    System.out.println("Enter cgpa: ");
                    cg = Double.parseDouble(br.readLine());
                    System.out.println("Enter course: ");
                    co = br.readLine();
                    arr[i] = new Student2(reg, name, sec, roll, year, cg, co);
                    i++;
                    System.out.println("Continue adding? y/n");
                    c1 = (char)br.read();
                    br.readLine();
                }
                break;
                case 2:
                System.out.println("Enter year:");
                year = Integer.parseInt(br.readLine());
                de.displayByYear(arr, year);
                break;
                case 3:
                System.out.println("Enter course: ");
                co = br.readLine();
                de.displayByCourse(arr, co);
                break;
                case 4:
                de.displayAllDetails(arr);
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid Choice!");
            }
        }
    }
}