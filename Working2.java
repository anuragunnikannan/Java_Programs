import java.io.*;
class Building1
{
    int floors;
    int rooms;
    int footage;
    public void getDetails()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of floors:");
        floors = Integer.parseInt(br.readLine());
        System.out.println("Enter number of rooms: ");
        rooms = Integer.parseInt(br.readLine());
        System.out.println("Enter footage: ");
        footage = Integer.parseInt(br.readLine());
    }
    public void displayDetails()
    {
        System.out.println("Floors: "+floors);
        System.out.println("Rooms: "+rooms);
        System.out.println("Footage: "+footage);
    }
}

class House1 extends Building1
{
    int bedrooms;
    int bathrooms;
    public void getRoom()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        getDetails();
        System.out.println("Enter number of bedrooms:");
        bedrooms = Integer.parseInt(br.readLine());
        System.out.println("Enter number of bathrooms: ");
        bathrooms = Integer.parseInt(br.readLine());
    }
    public void displayRoom()
    {
        displayDetails();
        System.out.println("Bedrooms: "+bedrooms);
        System.out.println("Bathrooms: "+bathrooms);
    }
}

class Office extends Building1
{
    int telephones;
    int tables;
    public void getItems()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        getDetails();
        System.out.println("Enter number of telephones:");
        telephones = Integer.parseInt(br.readLine());
        System.out.println("Enter number of tables: ");
        tables = Integer.parseInt(br.readLine());
    }
    public void displayItems()
    {
        displayDetails();
        System.out.println("Telephones: "+telephones);
        System.out.println("Tables: "+tables);
    }
}

public class Working2
{
    public static void main(String args[])throws IOException
    {
        Office of = new Office();
        of.getItems();
        of.displayItems();
    }
}