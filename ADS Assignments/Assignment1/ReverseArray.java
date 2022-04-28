import java.util.Scanner;
public class ReverseArray {
    /*static void revereseArray(int arr[],int start, int end){
        int temp;
          
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }    
    static void printArray(int arr[],int size){
        for (int i = 0; i < size; i++)
             System.out.print(arr[i] + " ");
          
         System.out.println();
    }
    public static void main(String args[]){
         
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        rvereseArray(arr, 0, 5);
        System.out.println("Reversed array is");
        printArray(arr, 6);
        */
/////============================OR===========================================

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of elements you want in array:");
		int n = sc.nextInt();
		
		int a[] = new int[n+1];
		System.out.println("Enter all the elements:");

		
		for(int i = 0; i < n; i++){
			
				a[i] = sc.nextInt();
		}
		
		System.out.print("Reversed array is : ");
		for(int i = n-1; i >= 0; i--){
			System.out.print(a[i] + " ");
		}
	
	}
}