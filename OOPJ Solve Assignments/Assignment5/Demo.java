class Animal{
	
	void eat(){
		System.out.println("Animal : Eat");
	}
	
	void sleep(){
		System.out.println("Animal : Sleep");
	}
	
}

class Bird extends Animal{
	
	Bird(){
		this.eat();
		this.sleep();
		this.fly();
	}
	/*
	void eat(){
		System.out.println("Bird : Eat");
	}
	*/
	void sleep(){
		System.out.println("Bird : Sleep");
	}
	void fly(){
		System.out.println("Bird : Fly");
	}
}

class Demo{
	public static void main(String args[]){
	
	Animal a1 = new Bird();
	//a1.eat()
	}
}