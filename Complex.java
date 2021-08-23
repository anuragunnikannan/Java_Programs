import java.util.*;
public class Complex
{
    private int real, imaginary;
    public Complex(int r, int i)
    {
        real = r;
        imaginary = i;
    }
    public void add(Complex co1, Complex co2)
    {
        int i = co1.imaginary + co2.imaginary;
        int r = co1.real + co2.real;
        System.out.println("Real: "+r);
        System.out.println("Imaginary: "+i+"i");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part for 1st complex number: ");
        int r1 = sc.nextInt();
        System.out.println("Enter complex part for 1st complex number: ");
        int i1 = sc.nextInt();
        System.out.println("Enter real part for 2nd complex number: ");
        int r2 = sc.nextInt();
        System.out.println("Enter complex part for 2nd complex number: ");
        int i2 = sc.nextInt();
        Complex co1 = new Complex(r1, i1);
        Complex co2 = new Complex(r2, i2);
        co1.add(co1, co2);
        sc.close();
    }
}