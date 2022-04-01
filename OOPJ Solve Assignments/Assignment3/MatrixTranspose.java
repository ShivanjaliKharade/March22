import java.util.*;
class MatrixTranspose

{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a1[][]= new int[3][3];
		int b1[][]= new int[3][3];
		
		// Matrix1 Input
		for(int i=0; i<a1.length; i++){
			for(int j=0; j<a1.length; j++){
				System.out.print("Array Elements:");
				a1[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		// Matrix2 Transpose
		for(int i=0; i<a1.length; i++){
			for(int j=0; j<a1.length; j++){
				System.out.print("Array Elements:");
				b1[i][j]=a1[j][i];
			}
			System.out.println();
		}
		for (int x[]: a1){
			for(int y :x){
				System.out.print(" "+y+" ");
			}
			System.out.println();
		}
		for (int x[]: b1){
			for(int y :x){
				System.out.print(" "+y+" ");
			}
			System.out.println();
		}
		
	}
}
		
	