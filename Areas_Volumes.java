import java.util.Scanner;
class Areas_Volumes 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("==================================================================");
		System.out.println("                 WELCOME TO");
		System.out.println("         AREA AND VOLUME CALCULATOR");
		System.out.println("==================================================================");
		System.out.println("    "+(char)4+"Enter 1 for calculating Areas");
		System.out.println("    "+(char)4+"Enter 2 for calculating Volumes");
		System.out.println("==================================================================");
		System.out.println("Enter your choice:");
		int choice1 = scan.nextInt();
		if (choice1==1)
		{
			System.out.println("You have choosen to calculate the Areas");
			System.out.println("    "+(char)4+"Enter 1 for calculating Area of Circle");
			System.out.println("    "+(char)4+"Enter 2 for calculating Area of Triangle");
			System.out.println("    "+(char)4+"Enter 3 for calculating Area of Square");
			System.out.println("    "+(char)4+"Enter 4 for calculating Area of Rectangle");
			System.out.println("    "+(char)4+"Enter 5 for calculating Area of Paralellogram");
			System.out.println("    "+(char)4+"Enter 6 for calculating Area of Rhombus");
			System.out.println("Enter your choice:    ");
			int choice2= scan.nextInt();
			if (choice2==1)
			{
				System.out.println("You have choosen to calculate area of circle");
				System.out.println("Enter the radius of circle:");
				double r= scan.nextDouble();
				double area_circle = 3.14*r*r;
                System.out.println("The Area of Circle is:"+area_circle);
			}
			else if (choice2==2)
			{
				System.out.println("You have choosen to calculate area of Triangle");
				System.out.println("Enter the base of triangle:");
				double b= scan.nextDouble();
				System.out.println("Enter the height of triangle:");
				double h= scan.nextDouble();
				double area_triangle = 0.5*b*h;
                System.out.println("The Area of Triangle is:"+area_triangle);
			}
			else if (choice2==3)
			{
				System.out.println("You have choosen to calculate Square");
				System.out.println("Enter the side  of Square:");
				double a= scan.nextDouble();
				double area_square = a*a;
                System.out.println("The Area of Square is:"+area_square);
			}
			else if (choice2==4)
			{
				System.out.println("You have choosen to calculate area of Rectangle");
				System.out.println("Enter the length of rectangle:");
				double l= scan.nextDouble();
				System.out.println("Enter the breadth of rectangle:");
				double b= scan.nextDouble();
				double area_rectangle = l*b;
                System.out.println("The Area of Rectangle is:"+area_rectangle);
			}
			else if (choice2==5)
			{
				System.out.println("You have choosen to calculate area of Paralellogram");
				System.out.println("Enter the breadth of paralellogram:");
				double b= scan.nextDouble();
				System.out.println("Enter the height of paralellogram:");
				double h= scan.nextDouble();
				double area_paralellogram = b*h;
                System.out.println("The Area of Circle is:"+area_paralellogram);
			}
			else if (choice2==6)
			{
				System.out.println("You have choosen to calculate area of Rhombus");
				System.out.println("Enter the digonal1 of rhombus:");
				double d1= scan.nextDouble();
				System.out.println("Enter the diagonal2 ofrhombus:");
				double d2= scan.nextDouble();
				double area_paralellogram = 0.5*d1*d2;
                System.out.println("The Area of Circle is:"+area_paralellogram);			
			}
			else
			{
				System.out.println("Please enter the valid input");
			}
		}
		else if (choice1==2)
		{
			System.out.println("You have choosen to calculate the Volumes");
			System.out.println("    "+(char)4+"Enter 1 for calculating Volume of Sphere");
			System.out.println("    "+(char)4+"Enter 2 for calculating Volume of Cone");
			System.out.println("    "+(char)4+"Enter 3 for calculating Volume of Cube");
			System.out.println("    "+(char)4+"Enter 4 for calculating Volume of Cuboid");
			System.out.println("    "+(char)4+"Enter 5 for calculating Volume of Cylinder");
			System.out.println("    "+(char)4+"Enter 6 for calculating Volume of Hemisphere");
			System.out.println("Enter your choice:    ");
			int choice3= scan.nextInt();
			if (choice3==1)
			{
				System.out.println("You have choosen to calculate the volume of a Sphere");
				System.out.println("Enter the radius of a Sphere");
				double r = scan.nextDouble();
				double sphere_volume= (4*3.14*r*r*r)/3;
				System.out.println("The volume of Sphere is:" +sphere_volume);
			}
			else if (choice3==2)
			{
				System.out.println("You have choosen to calculate the volume of a Cone");
				System.out.println("Enter the radius of a Cone:");
				double r = scan.nextDouble();
				System.out.println("Enter the height of a Cone:");
				double h = scan.nextDouble();
				double cone_volume= (1*3.14*r*r*h)/3;
				System.out.println("The volume of Sphere is:" +cone_volume);
			}
			else if (choice3==3)
			{
				System.out.println("You have choosen to calculate the volume of a Cube");
				System.out.println("Enter the side of a Cone:");
				double a = scan.nextDouble();
				double cube_volume= a*a*a;
				System.out.println("The volume of Sphere is:" +cube_volume);
			}
			else if (choice3==4)
			{
				System.out.println("You have choosen to calculate the volume of a Cuboid");
				System.out.println("Enter the length of a cuboid :");
				double l = scan.nextDouble();
				System.out.println("Enter the breadth of cuboid:");
				double b = scan.nextDouble();
				System.out.println("Enter the height of cuboid:");
				double h = scan.nextDouble();
				double cuboid_volume= l*b*h;
				System.out.println("The volume of Sphere is:" +cuboid_volume);
			}
			else if (choice3==5)
			{
				System.out.println("You have choosen to calculate the volume Cylinder");
				System.out.println("Enter the radius of a cylinder :");
				double r = scan.nextDouble();
				System.out.println("Enter the height of cylinder:");
				double h = scan.nextDouble();
				double cylinder_volume= 3.14*r*r*h;
				System.out.println("The volume of Sphere is:" +cylinder_volume);
			}
			else if (choice3==6)
			{
				System.out.println("You have choosen to calculate the volume of a Hemisphere");
				System.out.println("Enter the radius of a Hemisphere");
				double r = scan.nextDouble();
				double hemisphere_volume= (2*3.14*r*r*r)/3;
				System.out.println("The volume of Sphere is:" +hemisphere_volume);
			}
			else
			{
				System.out.println("Please enter valid input");
			}
		}
		else
		{
			System.out.println("Please enter valid input");
		}
	}
}

