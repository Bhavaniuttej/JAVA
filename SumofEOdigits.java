class SumofEOdigits 
{
	public static void main(String[] args) 
	{
		int x=65463;
		int esum=0;
		int podd=1;
		int l =0;
		while (x!=0)
		{
			int n = x%10;
			if (n%2==0)
			{
				esum=esum+n;
			}
			else 
			{
				podd=podd*n;
			}
			x=x/10;
		}
		System.out.println(esum);
		System.out.println(podd);

	}
}
