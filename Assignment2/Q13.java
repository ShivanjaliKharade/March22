import java.util.Scanner;
class Q13
{
    public static void main(String[] args) 
    {
        int l, b, perimeter, area;
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter length of rectangle:");
        l = sc.nextInt();
		
        System.out.println("Enter breadth of rectangle:");
        b = sc.nextInt();
		
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
		
        area = l * b;
        System.out.println("Area of rectangle:"+area);
    }
}