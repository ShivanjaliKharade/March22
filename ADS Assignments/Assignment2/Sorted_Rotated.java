//using binary search
import java.util.*;
class Sorted_Rotated {
	
	static int key;
	public static int BSearch(int arr[],int x,int left,int right){
		
		while(left <= right){
			int mid = (left + right)/2;
			
			if(key == arr[mid]){
			
				//System.out.println("condition : key == arr[mid]  ==> true"); 
				return mid; 
			}
			
			//====searching in left subarray=======>
			
			else if(arr[left] < arr[mid]){ //checking left subarray is sorted or not
				
				if(key >= arr[left] && key < arr[mid]){ 
					//System.out.println("condition : key >= arr[left] && key < arr[mid] ====> true");
					right = mid - 1; 
					
				}
				else
					left = mid + 1; 
			}
			
			//====searching in right subarray=======>
			
			else {
				if(key > arr[mid] && key <= arr[right]){	//checking right subarray is sorted or not
				//System.out.println("condition : key > arr[mid] && key <= arr[right] ====> true");
				left = mid + 1;
				}
				else 
					right = mid - 1;
			}
		}
		return -1;
		
	}
	public static void main(String...args){
		int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};	//array is sorted but rotated at 1(index 6)
		System.out.println("Array is : "+Arrays.toString(arr));
		//key = 33;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		key = sc.nextInt();
		int n = arr.length - 1;
		int res = BSearch(arr,key,0,n);
		
		if(res == -1){
			System.out.println("Element not found.");
		}
		else{
			System.out.println("Element found at an index = "+res);
		}
	} 
}