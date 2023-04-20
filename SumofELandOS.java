//WAPTP SUM  OF THE EVEN LARGEST DIGIT AND ODD SMALLEST DIGIT IN AGIVEN NUMBER 
import java.util.Scanner;
class  SumofELandOS
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		int smallest=9;
		int largest=0;
		int sum=0;
		while (num!=0)
		{
			int ld = num%10;
			if (ld>largest && ld%2==0)
			{
				largest=ld;
			}
			if (ld<smallest && ld%2!=0)
			{
				smallest=ld;		
			}
			num=num/10;
		}
		System.out.println("The largest even is:"+largest);
		System.out.println("The smallest odd is:"+smallest);
		System.out.println("The Sum of largest even and smallest odd is:"+(largest+smallest));
	}
}
