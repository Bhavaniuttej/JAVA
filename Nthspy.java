//Nthspy
import java.util.Scanner;
class Nthspy
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value");
		int num = scan.nextInt();
		int sln=1;
		for (int i=1;sln<=num ;i++ )
		{
			int temp=i;
			int sum=0;
			int product=1;
			while (temp!=0)
			{
				int ld = temp%10;
				sum=sum+ld;
				product=product*ld;
				temp=temp/10;
			}
			if (sum==product)
			{
				if (sln==num)
				{
					System.out.println(sln+")"+i);
				}
				sln++;
			}
		}
	}
}
