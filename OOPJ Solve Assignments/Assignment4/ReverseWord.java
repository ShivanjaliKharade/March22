//WAP to print words in reverse order
       // i/p:   ab cd ef gh ij kl
      // o/p:   kl ij gh ef cd ab
	  
class ReverseWord{
	public static void main(String args[]){
		String str = "ab cd ef gh ij kl";
		String s= " ";
		
		System.out.println("Splitting array");
	    String[] arr = str.split(" ");
	    /*
		for(String val: arr){
		System.out.println(val);
	    }
	*/
		for (int i = arr.length - 1; i >= 0; i--) { 
		
        s += arr[i] + " "; 
		}
		System.out.println(s);
		
	
	}
}