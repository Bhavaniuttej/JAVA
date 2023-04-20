import java.util.Scanner;
class  PolceExamEligibility
{
	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("****Welcome To Police Service Exam****");
		System.out.println("Are you male ?");
		System.out.println("If yes Enter true");
		System.out.println("If no Enter false");
		System.out.println("Enter your Choice:");
		String gender = scan.next();
		if(gender = male)
		{
			if(height>=165 && Degreepercentage >=60)
			{
				System.out.println("Enter the height");
				double h= scan.nextDouble();
				System.out.println("Enter the Degreepercentage");
				double percentage= scan.nextDouble();
				System.out.println("he is eligible to write police exam");
			}
			else 
			{
				System.out.println("he is not eligible to write police exam");
			}
		}
	}
}