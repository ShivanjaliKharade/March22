class Person{
	String name;
	int age;
	String institute;
	
	Person(String name, int age, String institute){
		this.name = name;
		this.age = age;
		this.institute = institute;
	}
}

class Teacher extends Person{
	double sal;
	String subject;
	
	Teacher(double sal, String subject){
		super("A",25,"CDAC");
		this.sal = sal;
		this.subject = subject;
	}
}

class student extends Person{
	int rollno;
	student(int rollno){
		super("Sayali",24,"KH");
		this.rollno = rollno;
	}
}

class CollegeStudent extends student{
	int y;
	String branch;
	CollegeStudent(int y, String branch){
		super(103);
		this.y = y;
		this.branch = branch;
	}
}

class HighSchool{
	public static void main(String args[]){
		Teacher s1 = new Teacher(30000.0,"Science");
		CollegeStudent s2 = new CollegeStudent(4,"Civil");
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.institute);
		System.out.println(s1.sal);
		System.out.println(s1.subject);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.institute);
		System.out.println(s2.rollno);
		System.out.println(s2.y);
		System.out.println(s2.branch);
		
		
		
	}
}