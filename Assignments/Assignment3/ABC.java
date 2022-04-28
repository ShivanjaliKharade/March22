//Combinations
class ABC{
	                        
	static void display(String str, String res){
		//base condition : when string is null exit
		if(str.length()==0){
			System.out.println(res);
			return;
		}
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);  
			String r1 = str.substring(0,i) + str.substring(i+1);  
			System.out.println("chk : "+r1);              //to chk
			//backtrack (recursion)
			display(r1,res+ch); 
			
		}
	}
	
	public static void main(String args[]){
		String s1 = "ABC";
		display(s1,"");
		
	}
	
}


/*
O/P : 
ABC
ACB
BAC
BCA
CAB
CBA
*/
