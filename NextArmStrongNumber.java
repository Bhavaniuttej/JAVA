class NextArmStrongNumber 
{
	public static void main(String[] args) 
	{
		int x=345;
		while (true)
		{
			x++;
			int count=0;
			int temp=x;
			while (temp!=0)
			{
				count++;
				temp=temp/10;
			}
			temp=x;
			int sum=0;
			while (temp!=0)
			{
				int ld = temp%10;
				int exp =1;
				for (int i=1;i<=count ;i++ )
				{
					exp = exp*ld;
				}		
				sum=sum+exp;
				temp = temp/10;
			}
			if (sum==x)
			{
				System.out.println(x);
				break;
			}	
		}
	}
}
