//WAPTP FIRST10 non FIBONACCI SERIES TERMS REVERSE ORDER
class  First10fibonacci10
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<10 ;i++)
		{
			a=b;
		    b=sum;
			sum=a+b;
		}
		for (int i =1;i<=10 ;i++ )
		{
			System.out.println(sum);
			sum=b;
			b=a;
			a=sum-b;
		}
	}
}
