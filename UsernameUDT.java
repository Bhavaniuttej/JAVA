import java.util.Scanner;
class UsernameUDT 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user name:");
		String name = scan.next();
		System.out.println("Enter how many times you need to print:");
		int a = scan.nextInt();
		int i =1;
	do
	{
		System.out.println(name);
		i++;
	}
	while (i<=a);
	}
}
