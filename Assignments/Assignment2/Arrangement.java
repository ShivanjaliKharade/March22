class Arrangement{
	public static void main(String args[]){
		
		int arr [] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int n = 9;
		
		//display array
		{
			System.out.println("Given Series is : ");
			for(int i=0; i<n; i++) { 
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
	     
		 System.out.println("Rearrange Series is : ");
		for(int i=0; i<n; i++){
			if(arr[i]<0)
				System.out.print(arr[i]+" ");
				
		}
		
		for(int i=0; i<n; i++){
			if(arr[i]>0)
				System.out.print(arr[i]+" ");
				
		}
		
		
	}
}