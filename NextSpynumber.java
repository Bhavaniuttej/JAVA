class NextSpynumber 
{
	public static void main(String[] args) 
	{
		int x=100;
		while (true)
		{
			x++;
			int sum=0;
			int product=1;
			int temp=x;
			while (temp!=0)
			{
				int ld = temp%10;
				sum=sum+ld;
				product=product*ld;
				temp=temp/10;
			}
			if (sum==product)
			{
				System.out.println("next spynumber"+x);
				break;
			}
			
		}
		
	}
}
