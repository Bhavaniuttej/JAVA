//WAPTF EXPONENTIAL VALUE OF THE LARGEST DIGIT TO THE POWER of SMALLEST DIGIT IN A GIVEN NUMBER
import java.util.Scanner;
class  ExponentialLargestSmallest
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int  num = scan.nextInt();
		int largest=0;
		int smallest=9;
		
		while (num!=0)
		{
			int ld = num%10;
			if (ld>largest)
			{
				largest = ld;
			}
			if (ld<smallest)
			{
				smallest=ld;
			}
		
		num=num/10;
		}
		int exp=1;
		for (int i=1;i<=smallest ;i++ )
		{
			exp = exp*largest;
		}	
		System.out.println(exp);
	}
}
