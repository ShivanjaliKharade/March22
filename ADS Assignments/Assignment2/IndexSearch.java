import java.util.Scanner;
class IndexSearch{
	
	//int [] arr = new int[10];
	int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
	int n = 10;
	int j=0;
	
	//display array
	public void display(){
	for(int i=0; i<n; i++){      
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
		
	//find array using index
	public int search(int key){
		for(j=0; j<n;j++){
			if(arr[j]==key){
				//System.out.println("Element "+key+" is present at index "+j);
				//break;
				return j;
			}
		}
				return -1;
		}
	
}
class  IndexSearch1{
	public static void main(String args[]){
		IndexSearch is1 = new IndexSearch();
		
		System.out.print("Given array : ");
		is1.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to search : ");
		int key = sc.nextInt();
		
		int x = is1.search(key);
		if(x==-1)
			//System.out.print("Number not Found.");
		System.out.print("-1");
		else 
			System.out.println("Element "+key+" is present at index "+x);
		
	}
}