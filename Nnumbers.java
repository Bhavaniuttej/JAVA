//WAPTFIND SUM OF N NUMBERS
import java.util.Scanner;
class  Nnumbers
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int sum=0;
		for (int i =1;true ;i++ )
		{
			int n= scan.nextInt();
			int ch = scan.next().charAt(0);
			if (ch=='+')
			{
				sum=sum+n;
			}
			else if (ch == '=')
			{
				sum=sum+n;
				break;
			}	
		}
		System.out.println("Sum of the given is:"+sum);	
	}
}
