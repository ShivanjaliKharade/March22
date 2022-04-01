// Reverse
import java.util.*;
class Reverse{
	public static void main(String[] args) {
       String reverse ="";
	   Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("String = "+str);
		
		    for(int i = str.length()-1; i>=0; i--){
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reversed = "+reverse);
	}
		
}












/*
  System.out.println(StringFormatter.reverseString("Welcome to CDAC"));  
    System.out.println(StringFormatter.reverseString("Kharghar & Juhu")); 
*/	