//Patterns using for loop

class Pattern{
	public static void main(String args[]){
	 /// Right angled Triangle
	System.out.println("Right angled Triangle");
	for(int i=1; i<=5; i++){
      for(int j=1; j<=i; j++){
		
		System.out.print("* ");
	}
	System.out.println();
	}
	System.out.println();

   //// Equilateral Triangle
     System.out.println("Equilateral Triangle");
    for(int i=1; i<=5; i++){
      for(int j=5; j>=i; j--){
		
		System.out.print(" ");
	}
	for(int k=1; k<=i; k++){
		
		System.out.print("* ");
	}
	System.out.println();
	}
	System.out.println();
	
	 //// K--Pattern
	System.out.print("K--Pattern");
	for(int i=6; i>=1; i--){
      for(int j=1; j<=i; j++){
		
		System.out.print("* ");
	}
	System.out.println();
	}
	for(int i=2; i<=6; i++){
      for(int j=1; j<=i; j++){
		
		System.out.print("* ");
	}
	System.out.println();
	
	}
	System.out.println();
	
	/// X---Pattern
	
	System.out.print("X Pattern");
	 for(int i=1; i<=5; i++){
      for(int j=1; j<=i; j++){
		
		System.out.print(" ");
	}
	for(int k=i; k<=5; k++){
		
		System.out.print("* ");
	}
	System.out.println();
	}
	for(int i=2; i<=5; i++){
      for(int j=5; j>=i; j--){
		
		System.out.print(" ");
	}
	for(int k=1; k<=i; k++){
		
		System.out.print("* ");
	}
	System.out.println();
	}
	
	
	
	}
}

    