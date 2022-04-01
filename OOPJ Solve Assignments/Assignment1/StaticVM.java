//WAP to access/invoke Static variable and static method. 
class StaticVM1{
	static int n1=10;
	static int n2=40;
	static int result;
	
	static int Add(){

		result = n1+n2;
		return result;
	}
}
	
class StaticVM{
	public static void main(String args[]){
	
		System.out.println("n1 = "+StaticVM1.n1);
		System.out.println("n2 = "+StaticVM1.n2);
		
		System.out.println("Addition = "+StaticVM1.Add());
		
	}

}