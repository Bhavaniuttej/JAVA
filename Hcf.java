//WAP TO FIND HCF OF GIVEN TWO NUMBERS
import java.util.Scanner;
class  Hcf
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n1:");
		int n1 = scan.nextInt();
		System.out.println("Enter the value of n2:");
		int n2 = scan.nextInt();
		int HCF =0;
		for (int i =1;i<=n1&&i<=n2 ;i++ )
		{
			if (n1%i==0&&n2%i==0)
			{
				HCF=i;
			}
		}
		System.out.println("The HCF of the given two numbers is"+HCF);
	}
}
