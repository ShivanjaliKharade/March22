import java.util.Scanner;
class Q13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int a = n;
		int rev = 0;
		
		while(n!=0)
		{
           int x = n%10;
		   rev = rev*10+x;
		   n=n/10;
		}
		System.out.println("Reverse of number "+a+" is = "+rev);
	}
}