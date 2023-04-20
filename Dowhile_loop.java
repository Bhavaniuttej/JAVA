import java.util.Scanner;
class Dowhile_loop 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times to be printed:");
		int n = scan.nextInt();
		int i=1;
		do
		{
			System.out.println("India");
			i++;
		}
		while (i<=n);
	}
}
