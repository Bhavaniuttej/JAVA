import java.util.Scanner;
class  NNDBTWONUMBERS
{0ooo
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the min range");
		int min = scan.nextInt();
		System.out.println("Enter the min range");
		int max = scan.nextInt();
		System.out.println("Enter the two numbers which are divisible with the given range");
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
		int b = scan.nextInt();
		for (int i=min;i<=max ;i++ )
		{
			if (i%a==0&&i%b==0)
			{
				System.out.println(i);
			}
		}
	}
}
