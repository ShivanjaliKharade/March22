import java.util.*;
class MatrixSub

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a1[][]=new int[3] [3];//1st matrix
		int b1[][]=new int[3] [3];//2nd matrix
		int c1[][]=new int[3] [3];//resultant matrix
		//Matrix Input 1
		for(int i=0;i<a1.length;i++){ //Row
			for(int j=0;j<a1.length;j++){//column
			
				System.out.print("Array Elements:");
				a1[i][j]=sc.nextInt();
			}
			//System.out.println();
		}
		//Matrix Input 2
		for(int i=0;i<b1.length;i++){ //Row
			for(int j=0;j<b1.length;j++){//column
			
				System.out.print("Array Elements:");
				b1[i][j]=sc.nextInt();
			}
			//System.out.println();
		}
		//Matrix Addition
		for(int i=0;i<c1.length;i++){ //Row
			for(int j=0;j<c1.length;j++){//column
			
				c1[i][j]=a1[i][j]-b1[i][j];//Addition
			}
			//System.out.println();
		}
		//--------------------------------------
		//Printing with for each Matrix 1
		for(int x[] : a1){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		//Printing with for each Matrix 2
		for(int x[] : b1){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		//Printing with for each Addition matrix
		for(int x[] : c1){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}