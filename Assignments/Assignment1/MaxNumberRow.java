class MaxNumberRow{
   public static void main(String[] args)
{
	int a1[][] = {	
					{0, 1, 1, 1},
					{0, 0, 1, 1},
					{1, 1, 1, 1},
					{0, 0, 0, 0}
				};
				
	int count=0;

	for(int i=0;i<4;i++){
		if(a1[i][0]==1){
			
			for(int j=0;j<4;j++){
				if(a1[i][j]==1){
					count++;
				}
			}
		}
	}
	System.out.println("Row containing max 1's : "+count);
		
	}
}