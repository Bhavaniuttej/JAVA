//waptp smalLest number inthe given number
import java.util.Scanner;
class SmallestNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int smallest=9;
		while (n!=0)
		{
			int ld =n%10;
			if (ld<smallest)
			{
				smallest=ld;
			}
			n=n/10;
		}
		System.out.println(smallest);
	}
}
