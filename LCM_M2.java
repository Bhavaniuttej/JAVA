//LCM M2
class LCM_M2 
{
	public static void main(String[] args) 
	{
		int n1=8;
		int n2=12;
		for (int i=1;true ;i++ )
		{
			if ((n1*i)%n2==0)
			{
				System.out.println("LCM IS"+(n1*i));
				break;
			}
		}
		
	}
}
