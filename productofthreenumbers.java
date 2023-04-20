import java.util.Scanner;
class productofthreenumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1= scan.nextInt();
		System.out.println("Enter the second number");
		int n2= scan.nextInt();
		System.out.println("Enter the third number");
		int n3= scan.nextInt();
		int product = n1*n2*n3;
			System.out.println("product of"+n1+","+n2+"and"+n3+"is:" +product); 
	}
}
