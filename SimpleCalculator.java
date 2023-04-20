import java.util.Scanner;
class SimpleCalculator 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("            WELCOME");
		System.out.println("        SIMPLECALCULATOR");
		System.out.println("    "+(char)4+"Enter 1 for ADDITION");
		System.out.println("    "+(char)4+"Enter 2 for SUBTRACTION");
		System.out.println("    "+(char)4+"Enter 3 for MULTIPLICATION");
		System.out.println("    "+(char)4+"Enter 4 for DIVISION(REMAINDER)");
        System.out.println("    "+(char)4+"Enter 5 for DIVISION(QUOTIENT)");
		System.out.println("ENTER YOUR CHOICE:");
		int choice= scan.nextInt();
		switch (choice)
		{
		case 1:
			{
			System.out.println("YOU HAVE SELECTED ADDITION");
			System.out.println("Enter the first number:");
			int a = scan.nextInt();
			System.out.println("Enter the second number:");
		    int b = scan.nextInt();
			System.out.println("THE ADDITION OF TWO NUMBERS"+a+" and "+b+ "is" +(a+b));
			}
		case 2:
			{
			System.out.println("YOU HAVE SELECTED SUBTRACTION");
			System.out.println("Enter the first number:");
			int a = scan.nextInt();
			System.out.println("Enter the second number:");
		    int b = scan.nextInt();
			System.out.println("THE SUBTRACTION OF TWO NUMBERS"+a+" and "+b+ "is" +(a-b));
			}
		case 3:
			{
			System.out.println("YOU HAVE SELECTED MULTIPLICATION");
			System.out.println("Enter the first number:");
			int a = scan.nextInt();
			System.out.println("Enter the second number:");
		    int b = scan.nextInt();
			System.out.println("THE MULTIPLICATION OF TWO NUMBERS" +a+" and "+b+ "is" +(a*b));
			}
        case 4:
			{
			System.out.println("YOU HAVE SELECTED DIVISION");
			System.out.println("Enter the first number:");
			int a = scan.nextInt();
			System.out.println("Enter the second number:");
		    int b = scan.nextInt();
			System.out.println("THE DIVISION OF TWO NUMBERS"+a+" and "+b+ "is" +(a%b));
			}
        case 5:
			{
			System.out.println("YOU HAVE SELECTED DIVISION");
			System.out.println("Enter the first number:");
			int a = scan.nextInt();
			System.out.println("Enter the second number:");
		    int b = scan.nextInt();
			System.out.println("THE DIVISION OF TWO NUMBERS"+a+" and "+b+ "is" +(a/b));
			}
        default : System.out.println("ENTER THE VALID INPUT");
		}
	}
}