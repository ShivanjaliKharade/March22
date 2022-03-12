import java.util.Scanner;
class Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println(n+" is an Even number");
		}
		
		else
			System.out.println(n+" is an Odd number");
	}
}