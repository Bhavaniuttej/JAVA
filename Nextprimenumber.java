//next prime number
class Nextprimenumber 
{
	public static void main(String[] args) 
	{
		int x=7;
		while (true)
		{
			x++;
			int count =0;
			for (int i=1;i<=x ;i++ )
			{
				if (x%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
					System.out.println("next prime numberis:"+x);
					break;
			}
		}
	
	}
}
