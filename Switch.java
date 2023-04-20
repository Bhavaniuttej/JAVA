import java.util.Scanner;
class Switch 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value :");
		int a = scan.nextInt();
		switch(a)
		{
			case 1: System.out.println("Hello");
			break;
			case 2: System.out.println("Hi");
			break;
			case 3: System.out.println("number?");
			break;
			case 4: System.out.println("cofee?");
			break;
			case 5: System.out.println("block");
			break;
			default: System.out.println("Enter the valid input:");
		}
	}
}
