import java.util.Scanner;
class Google_Bonous 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Workingexperience in Google:");
		int Workingexperience = scan.nextInt();
		if(Workingexperience >=5)
		{
            System.out.println("Enter your Salary in Google:");
			int Salary = scan.nextInt();
			if (Salary<=70000)
			{
				System.out.println("Your bonous is :" +0.2*Salary);
                double bonous = scan.nextDouble();
			}
			else
			{
				System.out.println("your not eligible for bonous");
			}
		}
		else
		{
			System.out.println(" your not eligible for bonous:");
		}
	}
}
