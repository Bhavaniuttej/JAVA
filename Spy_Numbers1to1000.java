class Spy_Numbers1to1000
{
	public static void main(String[] args) 
	{ 
		System.out.println("The spy numbers between 1 to 1000");
		int sln=1;
		for (int i=1;i<=1000 ;i++ )
		{
			int temp=i;
			int sum =0;
			int product=1;
			while (temp!=0)
			{
				int ld= temp%10;
				sum=sum+ld;
				product=product*ld;
				temp=temp/10;	
			}
			if (sum==product)
			{
				System.out.println(sln+")"+i);
				sln++;
			}
		}
	}
}
