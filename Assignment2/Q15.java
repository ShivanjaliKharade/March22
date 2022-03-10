import java.util.Scanner;  
class Q15
{  
    public static void main(String args[]) 
	{  
       int x, y, t;// swap x & y
       Scanner sc = new Scanner(System.in); 
	   
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
	   
       System.out.println("Original numbers: "+x +" "+ y);   
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+x +" " + y);  
       System.out.println( );  
    }    
}  