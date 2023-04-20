import java.util.Scanner;
class EntryPrice
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("****WELCOME TO PARK****");
		System.out.println("Enter Your Gender:");
		char Gender = scan.next().charAt(0);
		if(Gender == 'M'||Gender=='m')
		{
			System.out.println("Your ticket price is:100rs");	
		}
		else if(Gender=='F'||Gender=='f')
		{
			System.out.println("Your ticket price is:80rs");
		}
		else if(Gender =='T'||Gender=='t')
		{
			System.out.println("Your ticket price is:20rs");
		}
		else if(Gender=='C'||Gender=='c')
		{
			System.out.println("Your ticket price is:5rs");
		}
		else if(Gender=='S'||Gender=='s')
		{ 
			System.out.println("Your ticket price is:Free");
		}
		else
		{
			System.out.println("Enter the valid input");
		}
	}
}