import java.util.*;
public class Student
{
    String name;
    int roll;
    int sub1;
    int sub2;
    public Student(String n, int r, int s1, int s2)
    {
        name = n;
        roll = r;
        sub1 = s1;
        sub2 = s2;
    }
    public void calculate(Student st)
    {
        int total = st.sub1 + st.sub2;
        double percent = (double)(total*100)/200;
        System.out.println("Name: "+st.name);
        System.out.println("Roll No.: "+st.roll);
        System.out.println("Subject 1: "+st.sub1);
        System.out.println("Subject 2: "+st.sub2);
        System.out.println("Total: "+total);
        System.out.println("Percentage: "+percent);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String n = sc.nextLine();
        System.out.println("Enter rollno.: ");
        int r = sc.nextInt();
        System.out.println("Enter marks in subject 1: ");
        int s1 = sc.nextInt();
        System.out.println("Enter marks in subject 2: ");
        int s2 = sc.nextInt();
        Student st = new Student(n, r, s1, s2);
        st.calculate(st);
        sc.close();
    }
}