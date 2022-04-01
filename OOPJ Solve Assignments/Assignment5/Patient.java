

class DEMO1{
	private String name;
	private double height;
	private double weight;
	private double BMI1;
	
	void set(String name, double height, double weight){
		this.name= name;
		this.height=height;
		this.weight=weight;
	}
	double BMI(){
		BMI1 = (weight/(height*height))*703;
		return BMI1;
	}
	void get(){
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(BMI1);
	}
}
	
	class Patient{
		public static void main(String args[]){
			DEMO1 s1 = new DEMO1();
			s1.set("Radha",5.2,50.0);
			s1.get();
			System.out.println(s1.BMI());
			
		}
	}
