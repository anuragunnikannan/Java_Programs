import java.io.*;
class Building
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

class House extends Building
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

public class Working
{
    public static void main(String args[])throws IOException
    {
        House ho = new House();
        ho.getRoom();
        ho.displayRoom();
    }
}