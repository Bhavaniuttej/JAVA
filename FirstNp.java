//printing first n palindromes
import java.util.Scanner;
class  FirstNp
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of  n");
		int n = scan.nextInt();
		int sln =1;
		for (int i =1;sln<=n ;i++ )
		{
			int rev=0;
			int temp=i;
			while (temp!=0)
			{
				int p = temp%10;
				rev = rev*10+p;
				temp = temp/10;
			}
			if (rev==i)
			{
				System.out.println(sln+")"+i);
				sln++;
			}
		}
	}
}
