import java.util.Scanner;
class Scannerprograms 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = scan.nextInt();
		System.out.println("Enter the value of b:");
		int b = scan.nextInt();
		if(a>=b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
	}
}
