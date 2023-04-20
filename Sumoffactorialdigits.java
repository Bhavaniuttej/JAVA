//WPTF SUM OF THE FACTORIAL VALUES OF EACH DIGIT IN A GIVEN NUMBER
import java.util.Scanner;
class  Sumoffactorialdigits
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int factorial=1;
		int sum =0;
		for (int i =1;i<=n ;i++ )
		{
			int temp=i;
			while (temp!=0)
			{
				int ld = n%10;
				factorial=factorial*ld;
				sum=sum+factorial;
				n=n/10;
			}
		}
        System.out.println(sum);
	}
}
