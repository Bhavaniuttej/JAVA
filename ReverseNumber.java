//WAPT REVERSE THE GIVEN NUMBER
class  ReverseNumber
{
	public static void main(String[] args) 
	{
		int x =564;
		int Reverse = 0;
		while (x!=0)
		{
			int n = x%10;
			Reverse = Reverse*10+n;
			x=x/10;
		}
		System.out.println(Reverse);
	}
}
