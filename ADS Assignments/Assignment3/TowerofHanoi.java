class TowerofHanoi{
	
	static void toh(int n, char start, char intermediate, char destination){
		
		//termination(base) condition
		if(n==1)
			System.out.println("Disk from "+start+" to "+destination);
		else        //for multiple disk
		{
			toh(n-1,start,destination, intermediate);     //n-1 going from source to intermediate thr dest.
			System.out.println("Disk from "+start+" to "+destination);
			
			toh(n-1,intermediate,start,destination);         //n going from source to dest thr intermediate.
			
		}
		
	}
	
	public static void main(String args[]){
		
		int n=3;                      //can change no. of disk
		toh(n,'A','B','C');           //no.of bars is 3 only for all situations
		
	}
}