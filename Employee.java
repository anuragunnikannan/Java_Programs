import java.util.*;
public class Employee
{
    int emp_id;
    String emp_name;
    int basic_salary;
    Employee(int i, String n, int b)
    {
        emp_id = i;
        emp_name = n;
        basic_salary = b;
    }
    public void calculate_gross()
    {
        double da = (double)basic_salary*0.1;
        double hra = (double)basic_salary*0.15;
        double gross = basic_salary+da+hra;
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Employee Name: "+emp_name);
        System.out.println("Basic Salary: "+basic_salary);
        System.out.println("Gross Salary: "+gross);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id: ");
        int i = sc.nextInt();
        System.out.println("Enter employee name: ");
        String n = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter basic salary: ");
        int b = sc.nextInt();
        Employee em = new Employee(i, n, b);
        em.calculate_gross();
        sc.close();
    }
}