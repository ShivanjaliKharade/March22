import java.util.Scanner;
class Q11
{
	public static void main(String args[])
	{
		final double pi = 3.1415926536;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle: ");  
        int radius = sc.nextInt();		
		
        double area = pi*radius*radius;  
		System.out.println("The area of the circle is: "+area); 
		
        double circumference = 2*pi*radius;
        System.out.println("The circumference of the circle is: "+circumference);		
	}
}
	