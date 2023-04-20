import java.util.Scanner;
class  Polices_Exam_Eligibility
{
	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("****Welcome To Police Service Exam****");
		System.out.println("Are you male ?");
		System.out.println("If yes Enter true");
		System.out.println("If no Enter false");
		System.out.println("Enter your Choice:");
		boolean Choice = scan.nextBoolean();
		if(Choice == true)
		{
			System.out.println("Enter the height");
			double height= scan.nextDouble();
			System.out.println("Enter the Degreepercentage");
			double Degreepercentage= scan.nextDouble();
			if(height>=165 && Degreepercentage >=60)
			{
				System.out.println("he is eligible to write police exam");
			}
			else 
			{
				System.out.println("he is not eligible to write police exam");
			}
		}
		else
		{
			System.out.println("Enter the height");
			double height= scan.nextDouble();
			System.out.println("Enter the Intermediatepercentage");
			double Intermediatepercentage= scan.nextDouble();
			if(height>=145 && Intermediatepercentage >=60)
			{
				System.out.println("she is eligible to write police exam");
			}
			else 
			{
				System.out.println("she is not eligible to write police exam");
			}
		}
	}
}