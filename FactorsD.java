//WAPTP FACTORS/DIVISERS OF A GIVEN NUMBER
import java.util.Scanner;
class  FactorsD
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.println("The factors of given number:");
		for(int i =1;i<=num;i++)
		{
			if (num%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
