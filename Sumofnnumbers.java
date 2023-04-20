import java.util.Scanner;
class Sumofnnumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter min value:");
		int min = scan.nextInt();
		System.out.println("Enter max value:");
		int max = scan.nextInt();
		int sum=0;
		for (int i=min;i<=max ; i++)
		{
			sum = sum+i;
		}
		System.out.println("The sum of numbers is:"+sum);
	}
}
