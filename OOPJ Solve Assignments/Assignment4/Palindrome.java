// Palindrome
import java.util.*;
class Palindrome{
	public static void main(String args[]){
		String str, reverse ="";
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();

		
		for(int i = str.length()-1; i>=0; i--){
			reverse = reverse + str.charAt(i);
		}
		
		if(str.equals(reverse)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a Palindrome");
		}
	}
}