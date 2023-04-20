import java.util.Scanner;
class Spynumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		int sum=0;
		int product=1;
		while (num!=0)
		{
			int ld = num%10;
			sum=sum+ld;
			product =product*ld;
			num=num/10;
		}
		if (sum==product)
		{
			System.out.println("This is spy number");
		}
		else
		{
			System.out.println("This is not spy number");
		}

	}
}
