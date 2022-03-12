import java.util.Scanner;
class Q8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();	
		
		String str_n = Integer.toString(n);
		
	for(int i=0; i< str_n.length(); i++){
		System.out.print(str_n.charAt(i));
	}
	}
}