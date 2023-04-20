import java.util.Scanner;
class  SwitchGradeResult2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Grade:");
		char Grade = scan.next().charAt(0);
		switch (Grade)
		{
		case  'A' :case  'a' :System.out.println("You Secured First Rank");
		break;
		case  'B' :case  'b' :System.out.println("You Secured Second Rank");
		break;
		case  'C' :case  'c' :System.out.println("You Secured  First Class");
		break;
		case  'D' :case  'd' :System.out.println("You Secured Second Class");
		break;
		case  'E' :case  'e' :System.out.println("You Secured Just Pass");
		break;
		case  'F' :case  'f' :System.out.println("You Just Fail");
		break;
		default : System.out.println("Enter the valid input");
		}
	}
}
