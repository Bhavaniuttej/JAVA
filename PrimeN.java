//WAPTF FIRST N PRIME NUMBERS
import java.util.Scanner;
class PrimeN 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scan.nextInt();
		int sln =1;
		System.out.println("The first "+n+"prime numbers are");
		for (int i =1; sln<=n;i++ )
		{
			int count =0;
			for (int a =1;a<=i ;a++ )
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
