import java.util.Scanner;
class  Tourtomanali
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("***WELCOME TO MARTIN TOURS AND TRAVELS***");
		System.out.println("          ***TOUR TO MANALI***");
        System.out.println("SELECT THE MODE OF TRANSPORT");
		System.out.println("    "+(char)4+ "Enter 1 for Airlines");
        System.out.println("    "+(char)4+"Enter 2 for Train");
		System.out.println("    "+(char)4+"Enter 3 for Bus");
		System.out.println("    "+(char)4+"Enter 4 for Car");
		System.out.println("    "+(char)4+"Enter 5 for Bike");
		System.out.println("Enter your choice :");
		int choice1 = scan.nextInt();
		if (choice1==1)
		{
			System.out.println("You have choosen Airlines as a mode of transport");
			System.out.println("    "+(char)4+ "Enter 1 for 1st class");
			System.out.println("    "+(char)4+ "Enter 2 for 2nd class");
			System.out.println("    "+(char)4+ "Enter 3 for Business class");
            System.out.println("Enter your choice :");
			int choice2 = scan.nextInt();
			if (choice2==1)
			{
				System.out.println("You have choosen 1st class Airlines");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*75000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice3 = scan.nextInt();
				if (choice3==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
			else if (choice2==2)
			{
				
				System.out.println("You have choosen 2nd class Airlines");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*60000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice4 = scan.nextInt();
				if (choice4==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
			else if(choice2==3)
			{
				System.out.println("You have choosen Bussiness class Airlines");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*100000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice5 = scan.nextInt();
				if (choice5==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
		}
		else if(choice1==2)
		{
			System.out.println("You have choosen Train as a mode of transport");
			System.out.println("    "+(char)4+ "Enter 1 for Ac");
			System.out.println("    "+(char)4+ "Enter 2 for Non AC");
            System.out.println("Enter your choice :");
			int choice2 = scan.nextInt();
			if (choice2==1)
			{
				System.out.println("You have choosen AC in Train");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*10000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice3 = scan.nextInt();
				if (choice3==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
			else if (choice2==2)
			{
				
				System.out.println("You have choosen Non Ac in Train");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*8000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice4 = scan.nextInt();
				if (choice4==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
		}
		else if(choice1==3)
		{
			System.out.println("You have choosen Bus as a mode of transport");
			System.out.println("    "+(char)4+ "Enter 1 for Hired");
			System.out.println("    "+(char)4+ "Enter 2 for Government trasnport");
            System.out.println("Enter your choice :");
			int choice2 = scan.nextInt();
			if (choice2==1)
			{
				System.out.println("You have choosen Hired bus");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*15000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice3 = scan.nextInt();
				if (choice3==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
			else if (choice2==2)
			{
				
				System.out.println("You have choosen Government trasnsport bus");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*12000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice4 = scan.nextInt();
				if (choice4==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
		}
		else if(choice1==4)
		{
			System.out.println("You have choosen Car as a mode of transport");
			System.out.println("    "+(char)4+ "Enter 1 for XUV");
			System.out.println("    "+(char)4+ "Enter 2 for SUV");
			System.out.println("    "+(char)4+ "Enter 3 for MINI");
            System.out.println("Enter your choice :");
			int choice2 = scan.nextInt();
			if (choice2==1)
			{
				System.out.println("You have choosen XUV Car");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*30000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice3 = scan.nextInt();
				if (choice3==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
			else if (choice2==2)
			{
				
				System.out.println("You have choosen SUV Car");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*28000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice4 = scan.nextInt();
				if (choice4==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
			else if(choice2==3)
			{
				System.out.println("You have choosen MINI Car");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*24000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice5 = scan.nextInt();
				if (choice5==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
		}
		else if(choice1==5)
		{
			System.out.println("You have choosen Bike as a mode of transport");
			System.out.println("    "+(char)4+ "Enter 1 for 400CC and Above");
			System.out.println("    "+(char)4+ "Enter 2 for 200CC-400CC");
            System.out.println("Enter your choice :");
			int choice2 = scan.nextInt();
			if (choice2==1)
			{
				System.out.println("You have choosen 400CC and Above Bike");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*5000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice3 = scan.nextInt();
				if (choice3==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
			else if (choice2==2)
			{
				
				System.out.println("You have choosen 200CC-400CC Bike");
				System.out.println("Enter the number of person:");
				int n =scan.nextInt();
				System.out.println("Total price of tickets is:"+n*4000);
                System.out.println("Would like to proceed with booking");
				System.out.println("Enter 1 to say yes");
				System.out.println("Enter 2 to say no");
				System.out.println("Enter your choice:");
				int choice4 = scan.nextInt();
				if (choice4==1)
				{
					System.out.println("Your tickets are booked");
					System.out.println("Thank you and happy journey");
				}
				else 
				{
					System.out.println("Thanking you ");
				}
			}
		}
	}
}
