class Table{
	
///table upto 30 using for loop
public static void main(String args[]){
	
	for(int i =1; i<=30;i++){
		for(int j =1; j<=30; j++){
			System.out.println(i+"*"+j+"="+(i*j));
		}
		System.out.println("=======================");
	}



/// table using while loop

    int i=1;
    while(i<=10){
	    int j= 2*i;
		System.out.println("2 * "+i+" = "+j);
		i++;
	}
	System.out.println("=======================");
}
}
