import java.util.Scanner;
class  Areas
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("==================================================================");
		System.out.println("            WELCOME TO");
		System.out.println("         AREA CALCULATOR");
		System.out.println("==================================================================");
		System.out.println("        "+(char)1+"Enter 1 for circle:");
		System.out.println("        "+(char)1+"Enter 2 for trinagle:");
		System.out.println("        "+(char)1+"Enter 3 for square:");
		System.out.println("        "+(char)1+"Enter 4 for rectangle:");
		System.out.println("        "+(char)1+"Enter 5 for paralellogram:");
		System.out.println("        "+(char)1+"Enter 6 for rhombus:");
		System.out.println("==================================================================");
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();
		if (choice==1)
		{
			System.out.println("You have choosen circle to finds its area");
			System.out.println("Enter the radius of circle:");
			double r = scan.nextDouble();
			double circle_area = 3.14*r*r;
            System.out.println("Area of circle is:"+circle_area);
		}
		else if(choice==2)
		{
			System.out.println("You have choosen triangle to finds its area");
			System.out.println("Enter the Base of a triangle:");
			double b =scan.nextDouble();
            System.out.println("Enter the height of a triangle:");
			double h = scan.nextDouble();
			double triangle_area = 0.5*b*h;
            System.out.println("Area of traingle is:"+triangle_area);
		}
		else if(choice==3)
		{
			
			System.out.println("You have choosen square to finds its area");
			System.out.println("Enter the side of a square:");
			double a =scan.nextDouble();
			double square_area = a*a;
            System.out.println("Area of traingle is:"+square_area);
		}
		else if(choice==4)
		{
			
			System.out.println("You have choosen rectangle to finds its area");
			System.out.println("Enter the length of a rectangle:");
			double length = scan.nextDouble();
            System.out.println("Enter the breadth of a rectangle :");
			double breadth =scan.nextDouble();
			double rectangle_area = length*breadth;
            System.out.println("Area of rectangle is:"+rectangle_area);
		}
		else if(choice==5)
		{
			System.out.println("You have choosen paralellogram to finds its area");
			System.out.println("Enter the breadth of a paralellogram :");
			double breadth =scan.nextDouble();
			System.out.println("Enter the height of a paralellogram :");
			double height = scan.nextDouble();
			double paralellogram_area = breadth*height;
            System.out.println("Area of paralellogram  is:"+paralellogram_area);
		}
		else if(choice==6)
		{
			System.out.println("You have choosen rhombus to finds its area");
			System.out.println("Enter the length of diagonal1 of a rhombus :");
			double d1 =scan.nextDouble();
			System.out.println("Enter the length of diagonal2 of a rhombus :");
			double d2 = scan.nextDouble();
			double rhombus_area = 0.5*d1*d2;
            System.out.println("Area of rhombus  is:"+rhombus_area);
		}
	}
}
