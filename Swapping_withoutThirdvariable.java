//WAPT SWAP VALUES IN TWO VARIABLE WITHOUT USING THIRD VARIABLE
import java.util.Scanner;
class Swapping_withoutThirdvariable 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x = scan.nextInt();
		System.out.println("Enter the value of y:");
		int y = scan.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping the value of"+x+ "is:"+x);
		System.out.println("After swapping the values of "+y+"is:"+y);
	}
}
