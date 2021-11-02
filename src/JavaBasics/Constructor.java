package JavaBasics;

public class Constructor {
	
	
	String name;//instance variable
	int rollno;
	
	

	public static void main(String[] args) {
		
		Constructor s1=new Constructor();
		//new keyword is responsible for object creation
		//After object creation instance variable is created and given to object
		//After that the default values of the instance variables is assigned
		System.out.println(s1.name);//null
		System.out.println(s1.rollno);//0

	}

}
