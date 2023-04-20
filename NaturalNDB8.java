//WAPTP NATURAL NUMBERS WHICH ARE DIVISIBLE BY 8 WITH THE GIVEN RANGE
import java.util.Scanner;
class NaturalNDB8 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the min range:");
		int min = scan.nextInt();
		System.out.println("Enter the max range:");
		int max = scan.nextInt();
		System.out.println("the numbers which are divisible by 8");
		for (int i=min;i<=max ;i++ )
		{
			if (i%8==0)
			{
				System.out.println(i);
			}
		}
	}
}
