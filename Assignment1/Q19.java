import java.util.Scanner;
class Q19
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(int i=2;i<=n;i+=2){
			System.out.print(" "+i+"  ");
		}
		System.out.print("....");
	}
}
			