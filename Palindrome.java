//WAPTC WHEATHER THE GIVEN NUMBER IS PALINDROME OR NOT?
import java.util.Scanner;
class  Palindrome
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		int rev =0;
		int temp = num;
		while (temp!=0)
		{
			int n = temp%10;
			rev = rev*10+n;
			temp =temp/10;
		}
		if (rev==num)
			{
				System.out.println("The given number is palindrome");
			}
		else 
			{
				System.out.println("The given number is not a palindrome");
		    }
	}
}
