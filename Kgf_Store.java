import java.util.Scanner;
class  Kgf_Store
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("============================================================");
		System.out.println("      WELCOME TO KGF STORE");
        System.out.println("Enter 1 for Mobiles");
		System.out.println("Enter 2 for Laptops");
		System.out.println("Enter 3 for Smart_Watch");
		System.out.println("Enter 4 for TV");
		System.out.println("Enter 5 for AC");
		System.out.println("============================================================");
		System.out.println("Enter your choice:");
		int choice1= scan.nextInt();
		if(choice1==1)
		{
			System.out.println("You entered the world of mobiles");
			System.out.println("========================================================");
            System.out.println("Enter 1 for iphone");
		    System.out.println("Enter 2 for oneplus");
		    System.out.println("Enter 3 for realme");
		    System.out.println("Enter 4 for Samsung");
		    System.out.println("Enter 5 for Nokia");
            System.out.println("Enter 6 for Mi");
			System.out.println("========================================================");
            System.out.println("Enter your choice:");
            int choice2= scan.nextInt();
			if(choice2==1)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 145000");
			}
			else if(choice2==2)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 45000");
			}
			else if(choice2==3)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 20000");
			}
			else if(choice2==4)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 27000");
			}
			else if(choice2==5)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 25000");
			}
			else if (choice2==6)
			{
				System.out.println("Availability : Out of Stock");
				System.out.println("Price is:- 22000");
			}
		}
		else if(choice1==2)
		{
			System.out.println("You entered the world of Laptops");
			System.out.println("========================================================");
            System.out.println("Enter 1 for Mac");
		    System.out.println("Enter 2 for Hp");
		    System.out.println("Enter 3 for Dell");
		    System.out.println("Enter 4 for Acer");
		    System.out.println("Enter 5 for Lenovo");
            System.out.println("Enter 6 for Asus");
			System.out.println("========================================================");
            System.out.println("Enter your choice:");
            int choice3= scan.nextInt();
			if(choice3==1)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 300000");
			}
			else if(choice3==2)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 86000");
			}
			else if(choice3==3)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 60000");
			}
			else if(choice3==4)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 55000");
			}
			else if(choice3==5)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 49000");
			}
			else if (choice3==6)
			{
				System.out.println("Availability : Out of Stock");
				System.out.println("Price is:- 45000");
			}
		}
		else if(choice1==3)
		{
			System.out.println("You entered the world of Smartwatches");
			System.out.println("========================================================");
            System.out.println("Enter 1 for iwatch");
		    System.out.println("Enter 2 for fireboult");
		    System.out.println("Enter 3 for noise");
		    System.out.println("Enter 4 for boat");
		    System.out.println("Enter 5 for fossil");
            System.out.println("Enter 6 for fastrack");
			System.out.println("========================================================");
            System.out.println("Enter your choice:");
            int choice4= scan.nextInt();
			if(choice4==1)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 80000");
			}
			else if(choice4==2)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 3500");
			}
			else if(choice4==3)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 2500");
			}
			else if(choice4==4)
			{
				System.out.println("Availability : Out of Stock");
				System.out.println("Price is:- 2300");
			}
			else if(choice4==5)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 6000");
			}
			else if (choice4==6)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 4500");
			}
		}
		else if (choice1==4)
		{
			System.out.println("You entered the world of Tv");
			System.out.println("========================================================");
            System.out.println("Enter 1 for LG");
		    System.out.println("Enter 2 for Sony");
		    System.out.println("Enter 3 for Samsung");
		    System.out.println("Enter 4 for Oneplus");
		    System.out.println("Enter 5 for Mi");
            System.out.println("Enter 6 for Panasonic");
			System.out.println("========================================================");
            System.out.println("Enter your choice:");
            int choice4= scan.nextInt();
			if(choice4==1)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 30000");
			}
			else if(choice4==2)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 65000");
			}
			else if(choice4==3)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 45000");
			}
			else if(choice4==4)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 35000 ");
			}
			else if(choice4==5)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 28000");
			}
			else if (choice4==6)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 66000");
			}
		}
		else if (choice1==5)
		{
			System.out.println("You entered the world of AC");
			System.out.println("========================================================");
            System.out.println("Enter 1 for LG");
		    System.out.println("Enter 2 for Bluestar");
		    System.out.println("Enter 3 for Onida");
		    System.out.println("Enter 4 for Whirpoll");
		    System.out.println("Enter 5 for Voltas");
            System.out.println("Enter 6 for Samsung");
			System.out.println("========================================================");
            System.out.println("Enter your choice:");
            int choice5= scan.nextInt();
			if(choice5==1)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 45000");
			}
			else if(choice5==2)
			{
				System.out.println("Availability : Out of Stock");
				System.out.println("Price is:- 36000");
			}
			else if(choice5==3)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 38000");
			}
			else if(choice5==4)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 48000");
			}
			else if(choice5==5)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 56000");
			}
			else if (choice5==6)
			{
				System.out.println("Availability : InStock");
				System.out.println("Price is:- 65000");
			}
		}
		else
		{
			System.out.println("Enter the valid input");
		}
	}
}
