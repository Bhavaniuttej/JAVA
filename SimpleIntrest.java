import java.util.Scanner;
class SimpleIntrest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principle Amount:");
		long P = scan.nextLong();
        System.out.println("Enter the Time duration:");
		int T = scan.nextInt();
		System.out.println("Enter the Rate of Intrest:");
		double R = scan.nextDouble();
		System.out.println("Simple Intrest:"+(P*T*R)/100);
	}
}
