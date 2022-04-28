//using recursion
import java.util.Scanner;
 
class Palindrome{
    static boolean isPalRec(String str, int s, int e){
       
        if (s == e)
            return true;
 
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
 
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);
 
        return true;
    }
 
    static boolean isPalindrome(String str)
    {
        int n = str.length();
 
        if (n == 0)
            return true;
 
        return isPalRec(str, 0, n - 1);
    }
 
    public static void main(String args[])
    {
        String str = "123321";
 
        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
 
	
/*	


	public static void main(String args[]){
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		
		for(int i = n-1; i >= 0; i--){
			//System.out.print(str.charAt(i));         to chk
			
			char str2 = str.charAt(i);
	
			System.out.println(str2); 
			String temp += Character.toString(str2);
			//System.out.println(str2);                    //to chk
		
			/*if(str != temp){
				System.out.print("Not Palindrome");
			}else
				System.out.print("Palindrome");
			break;
			
		}
		
	}
	
}
*/