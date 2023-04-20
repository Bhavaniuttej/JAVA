class Pattern36
{
	public static void main(String[] args) 
	{
		int space=5;
		int star=1;
		for (int i =0;i<=5 ;i++ )
		{
			for (int a=1;a<=space ;a++ )
			{
				System.out.print(" ");
			}
			int n =1;
			for (int b = 0;b<star ;b++ )
			{
				System.out.print(n+" ");
				n=(n*(i-b))/(b+1);
			}
			System.out.println();
			space--;
			star++;
		}
	}
}
