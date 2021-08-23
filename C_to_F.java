import java.util.*;
class C_to_F
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");
		double c = sc.nextDouble();
		double f = ((9*c)/5)+32;
		System.out.println("Temperature in Fahrenheit is "+f);
		sc.close();
	}
}