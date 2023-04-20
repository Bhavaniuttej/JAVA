import java.util.Scanner;
class Operations 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("     "+(char)4+"Enter 1 for Even or Odd:");
		System.out.println("     "+(char)4+"Enter 2 for +ve or -ve :");
		System.out.println("Enter your choice:");
		int num = scan.nextInt();
		switch (num)
		{
			case 1:
			{
				System.out.println("You have choosen to check Even or Odd");
				System.out.println("Enter the number");
				long n = scan.nextLong();
				if (n%2==0)
				{
					System.out.println("The number is Even number");
				}
				else
				{
					System.out.println("The number is Odd number");
				}
			}
			break;
			case 2:
			{
				System.out.println("You have choosen to check +ve or -ve");
				System.out.println("Enter the number");
				long n = scan.nextLong();
				if (n>0)
				{
					System.out.println("The number is +ve number");
				}
				else if(n<0)
				{
					System.out.println("The number is -ve number");
				}
				else if(n==0)
				{
					System.out.println("The number is neutral number");
				}
			}
		}	
	}
}
