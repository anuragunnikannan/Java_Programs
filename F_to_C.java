import java.util.*;
class F_to_C
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit: ");
		double f = sc.nextDouble();
		double c = (5*(f-32))/9;
		System.out.println("Temperature in Celsius is "+c);
		sc.close();
	}
}
