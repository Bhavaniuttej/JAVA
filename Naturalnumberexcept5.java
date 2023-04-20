class Naturalnumberexcept5 
{
	public static void main(String[] args) 
	{
		System.out.println("Natural numbers 1 to 10 except 5 using while");
		int i =1;
		while (i<=10)
		{
			if (i==5)
			{
					i++;
				continue;
			}
			System.out.println(i);
		    i++;
		}
	}
}
