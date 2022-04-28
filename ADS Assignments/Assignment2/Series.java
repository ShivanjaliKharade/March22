//using recursion
//print natural number series & find its sum

class Series{
	
	static int count = 0;
	static int sum = 0;
	
	static void display(){  
	++count;
	    if(count<=10){
			System.out.print(count+" ");
			sum = sum + count; 
			display();                                              //recursion
			//System.out.print("Sum is: "+sum+" ");
		}
	}
	
	public static void main(String args[]){
		
		display();
		System.out.println();
		System.out.print("Sum of First 10 natural numbers is : "+sum+" ");

	}
	
}