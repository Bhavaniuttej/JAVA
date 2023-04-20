//n th palindrome
import java.util.Scanner;
class  nthpalindrome
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n th value:");
		int n =scan.nextInt();
		int sln= 1;
		for (int i=1;sln<=n ;i++ )
		{
			int rev=0;
			int temp=i;
			while (temp!=0)
			{
				int ld = temp%10;
				rev = rev*10+ld;
				temp= temp/10;
			}
			if (rev==i)
			{
				if (sln==n)
				{
					System.out.println(sln+")"+i);
				
				}
				sln++;
			}
		}
	}
}
