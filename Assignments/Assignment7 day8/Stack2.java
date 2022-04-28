//menu driven
import java.util.Scanner;
class Stack2{
	
	private int max;
	private long[]S1;
	private int top;
	
	Stack2(int s){      //pass data thr. constructor
		top = -1;
		max =s;
		S1 = new long[max];
	}
	
	public void push(long x){
		if(top==max-1){
			System.out.println("Stack is full!!!");
			return;
		}
		S1[++top] = x;
	}
	
	public long pop(){
		if(top==-1){
			System.out.println("Stack is Empty!!!");
			return top;
		}
		return S1[top--];
	}
	
	public long peek(){
		if(top==-1){
			return top;
		}
		return S1[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);   //another way
	}
	
	public boolean isFull(){
		return (top>=(max-1));
	}
	
	public void display(){
		System.out.println();
		for(int i=0; i<=top; i++){
			System.out.println(S1[i]);
		}
	}
	
}
//H.W. : COMPLETE MENU DRIVEN CODE  : DONE
class StackApp{
	public static void main(String args[]){
		Stack2 s1 = new Stack2(5);
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.isFull");
			System.out.println("4.isEmpty");
			System.out.println("5.Display");
			System.out.println("6.Exit");
			
			System.out.println("choose a option");
	        int choice = scan.nextInt();
		
		switch(choice){
		    
			case 1: System.out.println("enter the element to insert");
			        int b = scan.nextInt();
					System.out.println("After adding element : ");
					s1.push(b);
					break;
					
			case 2:	System.out.println("enter the element to remove");
					System.out.println("After removing element : ");
					s1.pop();
					break;
					
            case 3:if(s1.isFull())
						System.out.println("Stack is full !!!");
					else
						System.out.println("Stack is not full");
					break;
					
            case 4: if(s1.isEmpty())
						System.out.println("Stack is Empty");
					else
						System.out.println("Stack is not empty");
					break;
            case 5:  s1.display(); 
                      break;			
            case 6 : System.out.println(); 
                    System.exit(0);			
			default: System.out.println("invalid");
		}
		}
	
	}
}