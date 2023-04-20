//WAPT SWAP VALUE IN TWO VARIABLE USING THIRD VARIABLE
import java.util.Scanner;
class  Swap
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x = scan.nextInt();
		System.out.println("Enter the value of y:");
		int y = scan.nextInt();
		int z = x;
		x=y;
		y=z;
		System.out.println("After Swapping the value of"+x+"is:"+x);
		System.out.println("After swapping the value of "+y+"is:"+y);
	}
}
