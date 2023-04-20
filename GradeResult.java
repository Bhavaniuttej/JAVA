import java.util.Scanner;
class  GradeResult
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Grade:");
		char Grade = scan.next().charAt(0);
		if(Grade=='A')
		{
			System.out.println("You Secured First Rank");
		}
		else if(Grade=='B')
		{
			System.out.println("You Secured Second Rank");
		}
		else if(Grade=='C')
		{
			System.out.println("You Secured  First Class");
		}
		else if(Grade =='D')
		{
			System.out.println("You Secured Second Class");
		}
		else if(Grade=='E')
		{
			System.out.println("You Secured Just Pass");
		}
		else if(Grade=='F')
		{
			System.out.println("You Just Fail");
		}
		else
		{
			System.out.println("Enter the valid input");
		}
	}
}
