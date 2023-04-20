import java.util.Scanner;
class  MagicnumberP
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n =scan.nextInt();
		int sum=0;
		while (n>9)
		{
			
			int ld = n%10;
			sum=sum+ld;
			n=n/10;
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