class NextArmStrongNumber 
{
	public static void main(String[] args) 
	{
		int x=145;
		while (true)
		{
			x++;
			int sum=0;
			int temp=x;
			while (temp!=0)
			{
				int fact=1;
				int ld = temp%10;
				for (int i=1;i<=ld ;i++ )
				{
					fact=fact+i;
				}		
				sum=sum+fact;
				temp = temp/10;
			}
			if (sum==x)
			{
				System.out.println(x);
			}	
		}
	}
}
