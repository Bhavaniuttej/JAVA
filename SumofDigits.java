//WAPTFIND SUM OF THE DIGITS IN A GIVEN NUMBER
class  SumofDigits
{
	public static void main(String[] args) 
	{
		int x = 445;
		int n = 0;
		int sum =0;
		while (x!=0)
		{
			n=x%10;
			sum=sum+n;
			x=x/10;
		}
		System.out.println("The sum of the digits in number:"+sum);
	}
}
