import java.util.*;

class Count1{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		
		for(int i=0; i<s.length()-1; i++){
			int x = i+1;
			
			if(s.charAt(i)== '1' && s.charAt(x)== '0'){
				count++;
			}
		}
		System.out.println(count);
		
	}
}