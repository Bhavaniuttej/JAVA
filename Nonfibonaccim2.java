//WAPTP NON FIBONACCI TERMS FROM 0 TO 100 M2
class  Nonfibonaccim2
{
	public static void main(String[] args) 
	{
		int a =0;
		int b=1;
		int sum=0;
		for (int i =1;b<=100 ;i++ )
		{
			for (int j =b+1;j<sum&&j<=100 ;j++ )
			{
				System.out.println(j);
			}
			a=b;
			b=sum;
			sum=a+b;
		}
		
	}
}
