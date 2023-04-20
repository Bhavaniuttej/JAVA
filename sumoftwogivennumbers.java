import java.util.Scanner;
class sumoftwogivennumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1= scan.nextInt();
		System.out.println("Enter the second number");
		int n2= scan.nextInt();
		int sum= n1+n2;
		System.out.println("sum of"+n1+"and"+n2+"is:"+sum);
		}
}
