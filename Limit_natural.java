//10) WAPTP NATURAL NUMBERS IN THE GIVEN RANGE
//ENTER MIN RANGE;15
//ENTER MAX RANGE;21
import java.util.Scanner;
class  Limit_natural
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Min Range:");
		int a = scan.nextInt();
		System.out.println("Enter the Max Range:");
		int b = scan.nextInt();
		System.out.println("The numbers between the given range are:");
		for (int i=a; i<=b; i++)
		{
			System.out.println(i);
		}
	}
}
