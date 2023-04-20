//WAPT FIND SUM OF DIGITS OF A NUMBER1
class Practice_2 
{
	public static void main(String[] args) 
	{
		int x = 389;
		int count =0;
		int temp = x;
		int sum=0;
		while (temp!=0)
		{
			int n =temp%10;
			sum = sum+n;
			temp=temp/10;
		}
		System.out.println(sum);
	}
}
