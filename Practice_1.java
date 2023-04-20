class Practice_1 
{
	public static void main(String[] args) 
	{
		int count =0;
		int sln=1;
		for (int i =1;i<=100 ;i++ )
		{
			if (5%i==0)
			{
				count++;

			}
		}
		if (count==2)
		{
			System.out.println(sln+")"+i);
		}
	}
}
