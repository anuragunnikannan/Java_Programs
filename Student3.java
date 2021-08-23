class Student3
{  
    int id;  
    String name;
    Student3()
    {
        id = 0;
        name = "";
    }  
    void display()
    {
        System.out.println(id+" "+name);
    }  
    public static void main(String args[])
    {  
        Student3 s1=new Student3();  
        Student3 s2=new Student3();
        s1.id = 1;
        s1.name = "James";
        s2.id = 2;
        s2.name = "Michael";
        s1.display();  
        s2.display();  
    }  
}  