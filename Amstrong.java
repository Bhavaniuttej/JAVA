//WAPT CHECK WHETHER THE NUMBER IS AMSTRONG NUMBER
class  Amstrong
{
	public static void main(String[] args) 
	{
		int num=345;
		int count=0;
		int temp=num;
		while (temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=num;
		int sum=0;
		while (temp!=0)
		{
			int ld = temp%10;
			int exp =1;
			for (int i =1; i<=count;i++ )
			{
				exp = exp*ld;
			}
			sum=sum+exp;
			temp=temp/10;
		}
		if (sum==num)
		{
			System.out.println("This is a Armstrong");
		}
		else
		{
			System.out.println("This is not Amstrong number");
		}	
	}
}
