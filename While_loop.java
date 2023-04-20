import java.util.Scanner;
class While_loop 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times to printed:");
		int a =scan.nextInt();
		int i = 1;
		while (i<=a)
		{
			System.out.println("India");
			i++;
		}
	}
}
