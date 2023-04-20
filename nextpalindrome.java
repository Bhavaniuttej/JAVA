//next palindrome
class  nextpalindrome
{
	public static void main(String[] args) 
	{
		int x =9;
		while (true)
		{
			x++;
			int rev=0;
			int temp=x;
			while (temp!=0)
			{
				int ld = temp%10;
				rev = rev*10+ld;
				temp=temp/10;
			}
			if (rev==x)
			{
				System.out.println("Next palindrome is:"+x);
				break;
			}
		}
	}
}
