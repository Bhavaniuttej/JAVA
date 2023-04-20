//N strong numbers
import java.util.Scanner;
class NstrongNumber 
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=scan.nextInt();
		int sln=1;
		int sum=0;
		for (int i=1;i<=n ; i++)
		{
			int temp=i;
			while (temp!=0)
			{
				int ld = temp%10;
				int fact=1;
				for (int a=1;a<=ld ;a++ )
				{
					fact = fact*a;
				}
				sum=sum+fact;
				temp=temp/10;
			}
			if (sum==i)
			{
				System.out.println(sln+")"+i);
				
			}
			
		}
		sln++;
	}
}
