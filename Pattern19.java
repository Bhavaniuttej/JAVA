//next prime number
//11 13 17 19
//   23 29 31
//      37 41
//         43
class Pattern19 
{
	public static void main(String[] args) 
	{
		int x =7;
		for (int i =1;i<=4 ;i++ )
		{
			for (int j = 1; j<=4;j++ )
			{
				if (i<=j)
				{
					while (true)
					{
						x++;
						int count =0;
						for (int k =1;k<=x ;k++ )
						{
							if (x%k==0)
							{
								count++;
							}
						}
						if (count==2)
						{
							System.out.print(" "+x+" ");
							break;
						}
						
					}
				}
				else 
				{
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}
}
