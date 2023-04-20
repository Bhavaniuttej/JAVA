//WAPTP PRODUCT OF FACTORS OF AGIVEN NUMBER
import java.util.Scanner;
class  ProductOFF
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the given number:");
		int num = scan.nextInt();
		int product =1;
		for(int i=1;i<=num;i++)
		{
			if (num%i==0)
			{
				product = product*i;
			}
		}
		System.out.println(product);
	}
}
