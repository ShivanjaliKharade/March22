import java.util.Scanner;
class MissingNum{
	public static void main(String args[]){
		int sum1=0;
		int sum2=0;
		
		//take input from user	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = sc.nextInt();
			
		int arr[] = new int[n+1];
		System.out.println("Enter all the elements:");

		for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
		}
			/*
			//or directly input
			int arr [] ={1, 2, 4, 6, 3, 7, 8}
			*/
			
		//display to user
		System.out.print("Given natural no. series is : ");
		for(int i=0; i<n; i++){      
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		//find sum of n+1 numbers
		for(int i=1; i<=n+1; i++){
			//System.out.println(i);          to chk
			sum1 = sum1+i;
			
		}
		//System.out.println("Sum1: "+sum1);
		
		//find sum of given numbers
		for(int i=0; i<n; i++){
			//System.out.println(arr[i]);          to chk
			sum2 = sum2 + arr[i];

		}
		//System.out.println("Sum2: "+sum2);
		
		int diff = sum1 - sum2;
		System.out.println("Missing number in given series is : "+diff);
		
	}
}
