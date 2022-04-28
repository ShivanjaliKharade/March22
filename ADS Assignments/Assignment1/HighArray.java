class HighArray{
	
	int a1[] = new int [50];
	int n=10;
	int j=0;
	int k=0;
	
	public HighArray(){
		a1[0] = 31;
		a1[1] = 32;
		a1[2] = 33;
		a1[3] = 34;
		a1[4] = 0;
		a1[5] = 36;
		a1[6] = 37;
		a1[7] = 38;
		a1[8] = 39;
		a1[9] = 40;
	}
	
	//to find
	public boolean find(int key){
		for(int j=0; j<n; j++){
			if(a1[j]==key)
				break;
		}
		if(a1[j]==n){
			//System.out.println("Found");
				return true;
		}else
			//System.out.println("Not Found");
				return false;
		}
	
	//to insert
	public void insert(int index, int value){
		n++;
		for(k=n-1; k>=index-1;k--){
			a1[k+1]=a1[k]; 
		}
			a1[index] = value;
		
	}
	
	//to update 
	public void update(int index, int value){
		a1[index]= value;
	}
	
	//to delete
	public boolean delete(int longs){
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
			return false;
	}
	
	//to display
	public void display(){
		for(int i=0; i<n; i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
	}
}

class HighArrayApp{
	public static void main(String args[]){
		
		HighArray ha = new HighArray();
		System.out.println("Displaying numbers :");
		ha.display();
		
		boolean fa=ha.find(44);
		if(fa==true){
			System.out.println("Number Found");
		}else{
			System.out.println("Number not found");
		}
		//ha.find(44);
		
		System.out.println("After inserting number :");
		ha.insert(4,35);
		ha.display();
		
		System.out.println("Updating number :");
		ha.update(5,100);
		ha.display();
		
		System.out.println("After deleting number :");
		ha.delete(34);
		ha.display();
		
		
	}
}