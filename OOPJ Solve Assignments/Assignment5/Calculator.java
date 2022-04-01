
class Calculator{
	static int num1;
	static int num2;
	
	static int powerInt(int num1, int num2){
		int a = (int)(Math.pow(num1,num2));
		return a;
	}
	
	static double powerDouble(double num1, int num2){
		double b = Math.pow(num1, num2);
		return b;
	}
}

class Cal{
	public static void main(String args[]){
		//int x = Calculator.powerInt(12,2);
		//double y = Calculator.powerDouble(12.0,10);
		System.out.println(Calculator.powerInt(12,2));
		System.out.println(Calculator.powerDouble(12.0,10));
	}
}