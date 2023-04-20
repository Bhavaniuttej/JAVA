-// WAPTP FIBONACCI TERMS LESS THAN 1000
class  Fibonaccilessthan1000
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;sum<=1000;i++)
		{
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
		}
	}
}
