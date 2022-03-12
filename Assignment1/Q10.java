import java.util.Scanner;
class Q10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int a = n;
		int sum = 0;
		int x;
		while(n>0)
		{
           x = n%10;
		   sum+=x;
		   n=n/10;
		}
		System.out.println("Sum of digitis of "+a+" is = "+sum);
	}
}