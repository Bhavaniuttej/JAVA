//WAPTF THE PALINDROMES FROM 1 TO 1000
class  Palindrome1to1000
{
	public static void main(String[] args) 
	{
		int sln =1;
		for (int i=1; i<=1000;i++ )
		{ 
			int rev =0;
			int temp =i;
			while (temp!=0)
			{
				int n = temp%10;
				rev =rev*10+n;
				temp = temp/10;
			}
			if (rev==i)
			{
				System.out.println(sln+")"+i);
				sln++;	
			}			
		}		
	}
}
