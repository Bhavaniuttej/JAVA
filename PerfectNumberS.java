import java.util.Scanner;
class  PerfectNumberS
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		int sum =0;
		for (int i=1;i<=n/2 ; i++)
		{
			if (n%i==0)
			{
				sum = sum+i;
			}
		}
		if (sum==n)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is a not perfect number");
		}
	}
}
