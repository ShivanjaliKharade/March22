//fibonacci       0 1 1 2 3 5 8 ...

class FibonacciSeries{
	
	static int fibonacci(int n){  
		if(n<=1)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
		
		
	}
	
	public static void main(String args[]){
		
		System.out.println("Fibonacci Series of 10 numbers");
		
		for(int i=1; i<=10; i++){
		System.out.print(fibonacci(i)+" ");
		}
	}
	
}