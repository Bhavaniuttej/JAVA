//WAP TO CHECK WHATHER THE NUMBER IS MAGIC NUMBER
import java.util.Scanner;
class  Magicnumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n =scan.nextInt();
		while (n>9)
		{
			int sum=0;
			while (n!=0)
			{
				int ld = n%10;
				sum=sum+ld;
				n=n/10;
			}
			n=sum;
		}
		if (n==1)
		{
			System.out.println("It is a magic number");
		}
		else
		{
			System.out.println("It is not a magic number");
		}
	}
}
