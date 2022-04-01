import java.util.Scanner;
class Count{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		int a = 0;
		int b = 0;
		
		//count total 0 & 1 in given string
		for(int i=0; i<s.length();i++){
			
			if(s.charAt(i) == '0'){
				a++;
				//System.out.println("Total Zeros = "+a);
			}
			else {
				b++;
				//System.out.println("Total One = "+b);
			}
		}
		System.out.println("Total Zeros = "+a);
		System.out.println("Total One = "+b);
	}
}