package Constructor;

public class Student {
	
	String name;
	int rollno;
	
	Student(){
		
		System.out.println("Constructor");
	}
	Student(int a){
		
		System.out.println("Constructor A");
	}
	public static void main(String[] args) {
		Student s1=new Student(10);
		Student s2=new Student();
		Student s3=new Student();
		//Constructor will be called automatically for all objects as soon as object is created 
		//New keyword is responsible for creating an object
		//
	}

}
