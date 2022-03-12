import java.util.Scanner;
class Q17
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int a=n;
		int sum=0; 
		int x=0;
		
		while(n>0)
		{
           x = n%10;
		   sum = sum*10+x;
		   n=n/10;
		}
		if(a==sum)
		{
		System.out.println("Number "+a+" is a Palindrome");
		}
	     else
		   System.out.println("Number "+a+" is not Palindrome");
	}
}