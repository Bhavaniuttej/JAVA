import java.util.Scanner;
class OEdigits
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = scan.nextInt();
		int Ecount =0;
		int ocount =0;
		while (x!=0)
		{
			int n =x%10;
			if (n%2==0)
			{
				Ecount++;
			}
			else
			{
				ocount++;
			}
			x=x/10;
		}
		System.out.println("The number of even digits in the number is:"+Ecount);
		System.out.println("The number of odd digits in the number is:"+ocount);
	}
}
