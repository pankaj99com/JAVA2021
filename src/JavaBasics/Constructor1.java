package JavaBasics;

public class Constructor1 {
	
	
	String name;//instance variable
	int rollno;
	public Constructor1(String name,int rollno) {
		/*pankaj and 101 will come as arugument and will be given to name=pankaj and roll =no=101*/
		this.name=name;/*this.name---current object --After receiving the value it 
		will given to current object and this way constructor job is getting over*/
		this.rollno=rollno;
	}
	

	public static void main(String[] args) {
		
		Constructor1 s1=new Constructor1("pankaj",101);
		//new keyword is responsible for object creation
		//After object creation instance variable is created and given to object
		//After that the default values of the instance variables is assigned
		System.out.println(s1.name);/*null-->After assigning the value the null is
		replaced by original value and hence we can see this on the console as well*/
		System.out.println(s1.rollno);//0

	}

}
