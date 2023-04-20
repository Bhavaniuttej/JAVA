//prime within range
import java.util.Scanner;
class PrimeRange 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min range");
		int min =scan.nextInt();
		System.out.println("Enter the max range:");
		int max=scan.nextInt();
		int sln=1;
		for (int i=min;i<=max ;i++ )
		{
			int count =0;
			for (int a=1;a<=i ;a++ )
			{
				if (i%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(sln+")"+i);
				sln++;
			}
		}
	}
}	