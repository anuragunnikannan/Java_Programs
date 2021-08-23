import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage:");
		int percentage = sc.nextInt();
		char grade = '\u0000';
		if(percentage >= 90)
		{
			grade = 'A';
		}
		else if(percentage >= 80)
		{
			grade='B';
		}
		else if(percentage >= 70)
		{
			grade = 'C';
		}
		else if(percentage >= 60)
		{
			grade = 'D';
		}
		else if(percentage >= 40)
		{
			grade = 'E';
		}
		else if(percentage < 40)
		{
			grade = 'F';
		}
		System.out.println("Grade: "+grade);
		sc.close();
	}
}