class  Primenumber100p
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5000;i++ )
		{
			int count=0;
			for (int a=1;a<=i;a++ )
			{
				if (i%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				int rev =0;
				int temp=i;
				while (temp!=0)
				{
					int ld = temp%10;
					rev=rev*10+ld;
					temp = temp/10;
				}
				int temp1 = rev;
				if (i==temp1)
				{
					int sum=0;
					int product =1;
					while (temp1!=0)
					{
						int rem = temp1%10;
						sum= sum+rem;
						product=product*rem;
						temp1=temp1/10;
					}
					if (sum==product)
					{
						System.out.println(i);
					}
					
				}
			}
		}
	}
}
