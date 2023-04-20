import java.util.Scanner;
class  Policeexameligibility
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to police service exam");
		System.out.println("Enter your height");
	    double h  = scan.nextDouble();
		System.out.println("Enter your degree percentage");
	    double percentage  = scan.nextDouble();
		if(h >= 35&&percentage>=60)
		{ 
			System.out.println("you are eligible for police exam");
		}
		else
		{
			System.out.println("You are not eligible for exam");
		}
	}
}
