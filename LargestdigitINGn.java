class LargestdigitINGn 
{
	public static void main(String[] args) 
	{
		int x=456;
		int temp=x;
		int largest=0;
		while (temp!=0)
		{
			int ld = temp%10;
			if (ld>largest)
			{
				largest=ld;
			}
			temp=temp/10;
		}
		System.out.println(largest);
	}
}
