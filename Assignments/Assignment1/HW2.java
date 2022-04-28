import java.util.*;

class HighArray{
	int arr[] = new int[10];
	
	public void insert(int index, int number){
       if(10 > index ){
		   this.arr[index] = number;
	   }else{
		  System.out.println("lenght of array is 10, so enter an index less than 10");
	   }
	}
	public boolean find(int key){
	for(int i=0;i<arr.length;i++){
		if(key==arr[i]){
			return true;
		}
	}return false;
    }
	public void display(int index){
		   System.out.println(arr[index]);
	   }
	public void display(){
		   for(int i = 0; i < arr.length; i++ ){
		   System.out.print(arr[i]+", ");
	   }System.out.println();
	   }
	   
	   int i,j,k=9;
    public boolean delete(int longs){
	for( i=0; i<arr.length;i++){
		if(longs==arr[i]){
			break;
		}
	}
	for( j=i;j<arr.length;j++){
		if(i<9){
		arr[j]=arr[++i];
		
		
		}
		else{
			break;
			}
	}arr[k]=0;
	return true;
}
}

class HW2{
    public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		HighArray a1 = new HighArray();
		int d = 1;
		do{
		System.out.println("1) Insert");
		System.out.println("2) Display");
		System.out.println("3) Search");
		System.out.println("4) Delete");
		System.out.println("5) Exit");
		int input = sc.nextInt(); 
		int c; 
		switch(input){
			case 1 : {
				do{
				System.out.println("Enter the index and the number");
				int a = sc.nextInt();
				int b = sc.nextInt();
				a1.insert(a,b);
				System.out.println("to enter another number press 1");
				c = sc.nextInt();
				}
				while(c == 1);
				break;
			}
		    case 2 : {
			    System.out.println("press 1 to display tthe array elemnts");
				int a = sc.nextInt();
				if(a==1){
					a1.display();
				}else{
					System.out.println("Invalid Input");
				}break;
			}
		    case 3 : {
				System.out.println("Enter the number to search, if present returns true, else false");
				int a = sc.nextInt();
				a1.find(a);
				break;
			}
			case 4 : {
				System.out.println("Enter the number you want to delete");
				int a = sc.nextInt();
				a1.delete(a);
				break;
			}
			case 5 : {
				System.out.println("Enter 1 to exit");
				d = 2;
				break;
			}
		}
    }while(d == 1);
		
  }
}
