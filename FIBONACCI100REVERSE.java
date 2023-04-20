//WAPTP 100 FIBONACCI TERMS IN REVERSE ORDER
class FIBONACCI100REVERSE 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for (int i =1;i<=100 ;i++ )
		{
			a=b;
			b=sum;
			sum=a+b;
		}
		for (int i =0; i<=100;i++ )
		{
			if (i!=sum)
			{
				System.out.println(i);
			}
			else
			{
				sum=b;
				b=a;
				a=sum-b;
			}
		}
	}
}
