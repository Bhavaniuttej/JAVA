//WAPT PRINT HCF BY USING LONG DIVISION METHOD;
import java.util.Scanner;
class  HCFLONGDIVISION
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n1:");
		int n1 = scan.nextInt();
		System.out.println("Enter the value of n2:");
		int n2 = scan.nextInt();
		int dividend =n1;
		int divisor=n2;
		while (divisor!=0)
		{
			int rem= dividend%divisor;
			dividend=divisor;
			divisor=rem;
		}	
		System.out.println(dividend);
	}
}
