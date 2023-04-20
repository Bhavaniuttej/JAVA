//COUNT THE NUMBER OF FACTORS OF A GIVEN NUMBER...........................+
import java.util.Scanner;
class FactorsCount 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		int count = 0;
		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
		System.out.println("The number of factors of a given number:"+count);
	}
}
