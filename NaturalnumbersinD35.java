
import java.util.Scanner;
class  NaturalnumbersinD35
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min range:");
		int min =scan.nextInt();
		System.out.println("Enter the max range:");
		int max =scan.nextInt();
		for (int i=min;i<=max ;i++ )
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}
