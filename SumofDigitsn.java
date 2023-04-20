import java.util.Scanner;
class  SumofDigitsn
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		int n =0;
		int sum =0;
		while (num!=0)
		{
			n=num%10;
			sum = sum+n;
			num=num/10;
		}
		System.out.println("The sum of the digits of a number:"+sum);
	}
}
