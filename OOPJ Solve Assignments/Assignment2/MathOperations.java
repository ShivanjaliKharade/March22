// Implement math operation using constructor and instance methods.


class Operations{
	
	int n1;
	int n2;

	Operations(int a, int b){ 
		this.n1 = a;
		this.n2 = b;
		System.out.println(n1);
		System.out.println(n2);
	}
	
	static int result;
	
	void add(){
		result = n1 + n2;
		System.out.println("add= "+result);
	}
	
	void sub(){
		result = n1 - n2;
		System.out.println("sub= "+result);
	}
	
	void mul(){
		result = n1 * n2;
		System.out.println("mul= "+result);
	}
	
	void div(){
		result = n1 / n2;
		System.out.println("div= "+result);
	}
	
	void mod(){
		result = n1 % n2;
		System.out.println("mod= "+result);
	}
}

class MathOperations{
	public static void main(String args[]){
	
		Operations m1 = new Operations(8,2);
		m1.add();
		
		Operations m2 = new Operations(15,2);
		m2.sub();
		
		Operations m3 = new Operations(10,4);
		m3.mul();
		
		Operations m4 = new Operations(6,2);
		m4.div();
		
		Operations m5 = new Operations(10,2);
		m5.mod();
	}
}
