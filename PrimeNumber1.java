// WAPTP PRIME NUMBERRS BETWEEN 1 TO 100
class PrimeNumberl  
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100 ;i++ )
		{
			int count = 0;
			for (int a =1;a<=i;a++ )
			{
				if (i%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(i);
			}
		}
	}
}
