//A B C D E
//F G H I J
//K L M N O
//P Q R S T
//U V W X Y 
class  Patternalphabets
{
	public static void main(String[] args) 
	{
		char x ='A';
		for (int i =1;i<=5 ;i++ )
		{
			for (int j =1;j<=5 ;j++)
			{
				System.out.print(" "+x+" ");
				x++;
			}
			System.out.println();
		}
		
	}
}
