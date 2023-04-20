import java.util.Scanner;
class Bill 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for Silver");
		System.out.println("Enter 2 for Gold");
		System.out.println("Enter your element:");
		double element = scan.nextDouble();
		System.out.println("Enter your Bill:");
		double Bill = scan.nextDouble();
		if(element ==1)
		{
			System.out.println("Welocome to Silver");
			if (Bill>=20000)
			{
				System.out.println("Your bill amount is:"+0.88*Bill);
				double discount = scan.nextDouble();
			}
			else
			{
				System.out.println("your bill amount is:"+0.96*Bill);
			}
		}
		else
		{
			System.out.println("Welcome to gold");
			if (Bill>=500000)
			{
				System.out.println("Your bill amount is:"+0.90*Bill);
				double discount = scan.nextDouble();
			}
			else
			{
				System.out.println("your bill amount is:"+0.95*Bill);
			}
		}
	}
}
