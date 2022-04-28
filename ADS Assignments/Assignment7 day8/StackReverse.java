//String reversal
class StackStringReverse{
	
	private int max;
	private long[]S1;
	private int top;
	
	StackStringReverse(int s){      //pass data thr. constructor
		top = -1;
		max =s;
		S1 = new long[max];
	}
	
	public void push(long x){
		S1[++top] = x;
	}
	
	public long pop(){
		return S1[top--];
	}
	
	public long peek(){
		return S1[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);   //another way
	}
	
	public boolean isFull(){
		return (top>=(max-1));
	}
	
	public void display(){
		for(int i=0; i<=top; i++){
			System.out.println(S1[i]);
		}
	}
	
}

class StackReverse{
	
	public static void reverse(StringBuffer str){
			int n = str.length();
			StackStringReverse s1 = new StackStringReverse(n);
			
			for(int i=0; i<n; i++){
				s1.push(str.charAt(i));
			}
			for(int i=0; i<n; i++){
			char ch = (char)s1.pop();
			str.setCharAt(i,ch);
			}
		}
		
	public static void main(String args[]){
		
		StringBuffer s = new StringBuffer("CDAC MUMBAI");
		reverse(s);
		System.out.println("Reverse String : "+s);
		
	}
	
}