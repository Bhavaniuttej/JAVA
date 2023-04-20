import java.util.Scanner;
class LotteryWinner 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the ticket number:");
		int ticketnumber = scan.nextInt();
		if (ticketnumber==77)
		{
			System.out.println("Congratulations you won the lottery");
		}
		else
		{
			System.out.println("Sorry better luck next time");
		}
	}
}
