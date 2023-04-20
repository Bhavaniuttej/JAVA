import java.util.Scanner;
class  Ias_exams
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age:");
	    int age = scan.nextInt();
		if(age>=21&&age<=32)
		{ 
			System.out.println("You are eligible for writing ias exam");
		}
		else
		{
			System.out.println("You are not eligible for writing ias exam");
		}
	}
}
