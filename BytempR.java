class BytempR 
{
	public static void main(String[] args) 
	{
		int x =568;
		int rev =0;
		int temp=x;
		while (temp!=0)
		{
			int n =temp%10;
			rev = rev*10+n;
			temp = temp/10;
		}
		System.out.println(rev);
	}
}
