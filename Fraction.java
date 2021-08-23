public class Fraction
{
    double numerator;
    double denominator;
    public Fraction()
    {
        numerator = 68;
        denominator = 100;
    }
    public Fraction(double n, double d)
    {
        numerator = n;
        denominator = d;
    }
    public void display()
    {
        System.out.println(numerator+"/"+denominator+" = "+(double)(numerator/denominator));
    }
    public static void main(String args[])
    {
        Fraction fr1 = new Fraction();
        Fraction fr2 = new Fraction(32, 27);
        Fraction fr3 = new Fraction(51, 17);
        fr1.display();
        fr2.display();
        fr3.display();    
    }
}