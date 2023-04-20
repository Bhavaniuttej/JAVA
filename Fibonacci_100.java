//WAPTP FIBONACCI 100 TERMS IN REVERSE ORDER
class  Fibonacci_100
{
	public static void main(String[] args) 
	{
		long a=0;
		long b=1;
		long sum =0;
		int sln=1;
		for (int i =1;i<=100 ;i++ )
		{
			System.out.println(sln+")"+sum);
			sln++;
			a=b;
			b=sum;
			sum=a+b;
		}
	}
}
