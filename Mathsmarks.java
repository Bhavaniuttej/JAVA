import java.util.Scanner;
class  Mathsmarks
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the matrhs marks");
	    int marks = scan.nextInt();
		if(marks >= 35)
		{ 
			System.out.println("you are passed");
		}
		else
		{
			System.out.println("You are failed");
		}
	}
}
