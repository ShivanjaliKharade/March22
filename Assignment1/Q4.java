import java.util.Scanner;
class Q4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		n1 = n1 + n2;   
        n2 = n1 - n2;   
        n1 = n1 - n2;
		System.out.println("Swap numbers = "+n1+" "+n2);
	}
}