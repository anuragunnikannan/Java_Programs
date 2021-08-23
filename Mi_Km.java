import java.util.*;
class Mi_Km
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in miles:");
		double mile = sc.nextDouble();
		double km = 1.6093*mile;
		System.out.println(km+" km");
		sc.close();
	}
}