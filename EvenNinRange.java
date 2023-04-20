//WAPTP EVEN NATURAL NUMBER WITHIN THE GIVEN RANGE
import java.util.Scanner;
class  EvenNinRange
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the MIN range:");
		int min =scan.nextInt();
		System.out.println("Enter the MAX range:");
		int max =scan.nextInt();
		System.out.println("Even natural numbers between the given range are:");
		for(int i=min;i<=max;i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
