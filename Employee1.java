import java.io.*;
public class Employee1
{
    int empid;
    String name;
    int salary;
    public Employee1(int e, String n, int s)
    {
        empid = e;
        name = n;
        salary = s;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Employee1 em[] = new Employee1[5];
        for(int i = 0;i<5;i++)
        {
            System.out.println("Enter employee id for employee "+(i+1)+":");
            int e = Integer.parseInt(br.readLine());
            System.out.println("Enter employee name: ");
            String n = br.readLine();
            System.out.println("Enter salary: ");
            int s = Integer.parseInt(br.readLine());
            em[i] = new Employee1(e, n, s);
        }
        System.out.println("EmpID\tEmployee Name\tSalary");
        for(int i = 0;i<5;i++)
        {
            System.out.println(em[i].empid+"\t"+em[i].name+"\t\t"+em[i].salary);
        }
    }
}