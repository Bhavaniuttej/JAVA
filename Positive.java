import java.util.Scanner;
class Positive 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		double Num = scan.nextDouble();
		if(Num > 0)
		{
			System.out.println("the number is positive:");	
		}
		else if(Num < 0)
		{
			System.out.println("the number is negative:");
		}
		else
		{
			System.out.println("the number is neutral:");
		}
	}
}
