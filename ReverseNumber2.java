import java.util.Scanner;
class  ReverseNumber2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		int rev = 0;
		while (num!=0)
		{
			int n = num%10;
			rev = rev*10+n;
			num = num/10;
		}
		System.out.println(rev);
	}
}
