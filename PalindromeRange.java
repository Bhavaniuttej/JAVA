//39.WAPTP PALINDROMES WITH IN THE GIVEN RANGE
import java.util.Scanner;
class  PalindromeRange
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min range:");
		int min =scan.nextInt();
		System.out.println("Enter the max range:");
		int max =scan.nextInt();
		int sln =1;
		for (int i =min;i<=max ;i++ )
		{
			int rev =0;
			int temp = i;
			while (temp!=0)
			{
				int n = temp%10;
				rev =rev*10+n                       ;
				temp=temp/10;
			}
			if (rev==i)
			{
				System.out.println(sln+")"+i);
				sln++;
			}
		}
	}
}
