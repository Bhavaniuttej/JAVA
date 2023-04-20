import java.util.Scanner;
class Season
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month number:");
		int num = scan.nextInt();
		switch (num)
		{
		case 3 :case 4: case 5:System.out.println("It is summer");
		break;
		case 6 :case 7: case 8:System.out.println("It is rainy");
		break;
		case 9 :case 10: case 11:System.out.println("It is spring");
		break;
		case 12 :case 1: case 2:System.out.println("It is winter");
		break;
		default : System.out.println("Enter the valid input");
		}
	}
}
