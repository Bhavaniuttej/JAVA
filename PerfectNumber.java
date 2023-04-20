class PerfectNumber 
{
	public static void main(String[] args) 
	{
		int x=6;
		int sum =0;
		for (int i=1;i<=x/2 ;i++ )
		{
			if (x%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==x)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is a Not perfect number");
		}
	}
}
