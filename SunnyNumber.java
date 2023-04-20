//Wapt check whether the given number is sunny or not?
import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  anumber:");
		int n = scan.nextInt();
		boolean issunny = false;
		for (int i =1;i<n ;i++ )
		{
			if (i*i == (n+1))
			{
				issunny = true;
				break;
			}
		}
		if (issunny==true)
		{
			System.out.println("It is a sunny number");
		}
		else
		{
			System.out.println("It is not a sunny Number");
		}
	}

}
