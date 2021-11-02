package Constructor;

public class Student1 {
	
	String name;//instance variables
	int rollno;
	
	Student1(String name,int rollno){//Parameterized constructor
		
		this.name=name;//value passed during object creation is given to instance variable
		this.rollno=rollno;
		
	}

	public static void main(String[] args) {
		Student1 s1=new Student1("Pankaj",101);//object creation and instance variable initialization with 
		System.out.println(s1.name+"-----------"+s1.rollno);
		Student1 s2=new Student1("Anand",102);
		System.out.println(s2.name+"-----------"+s2.rollno);
		Student1 s3=new Student1("Rahul",103);
		System.out.println(s3.name+"-----------"+s3.rollno);
		
	}

}
