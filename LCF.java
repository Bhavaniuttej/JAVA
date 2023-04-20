//WAPTP LCM
import java.util.Scanner;
class LCF 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n1:");
		int n1= scan.nextInt();
		System.out.println("Enter the value of n2:");
		int n2=scan.nextInt();
		for (int i=1;true ;i++ )
		{
			if (i%n1==0&&i%n2==0)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
