import java.util.Scanner;
class HighArray1{

		int a1[] = new int [5];
		int j,i,k=0;
		int n=5;
		
	
	public void insert(int index, int num){
		
		if(index<n){
		   a1[index] = num;
	   }else{
		  System.out.println("lenght of array is 10, so enter an index less than 10");
	   }
	}
	
	//to find                                    problem need to solve?
	void find(int key){
		for(i=0; i<n; i++){
			if(a1[i]==key)
				break;
		}
		if(a1[i]==n){
			System.out.println("Not Found");
				
		}else
			System.out.println("Found");
				
		}
	
	/*//to update 
	void update(int index, int value){
		a1[index]= value;
	}*/
	
	//to delete                          problem need to solve?
	void delete(int longs){
		int key = longs;
		if(j<n){
		for(j=0;j<n;j++){
			if(a1[j] == key)
				break;
		}
		
		for(k=j; k<n;k++){
			a1[k]=a1[k+1];     
		//n--;
		
		}
		n--;
		}	
	}
	
	//to display
	void display(){
		for(int i=0; i<n; i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
}

class HighArrayMenu{
    public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		HighArray1 ha1 = new HighArray1();
		int d = 1;
		do{
		System.out.println("1. Insert");
		System.out.println("2. Display");
		System.out.println("3. Search");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		int input = sc.nextInt(); 
		int ch; 
		switch(input){
			case 1 : {
				do{
				System.out.println("Enter index & respective element");
				int index = sc.nextInt();
				int num = sc.nextInt();
				ha1.insert(index,num);
				System.out.println("to enter another number press 1");
				ch = sc.nextInt();
				}
				while(ch == 1);
				break;
			}
		    case 2 : {
			    System.out.println("press 1 to display array elements");
				int a = sc.nextInt();
				if(a==1){
					ha1.display();
				}else{
					System.out.println("Invalid Input");
				}break;
			}
		    case 3 : {
				System.out.println("Enter number to search");
				int key = sc.nextInt();
				ha1.find(key);
				break;
			}
			case 4 : {
				System.out.println("Enter number to delete");
				int n2 = sc.nextInt();
				ha1.delete(n2);
				break;
			}
			case 5 : {
				System.exit(0);
			}
		}
    }while(d == 1);
		
  }
}