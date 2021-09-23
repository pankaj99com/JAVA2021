package OOPSConceptPart1;

public class ConstructorWithThisKeyword {
//class variables
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name,int age){
		this.name=name;//this keyword is used to initialize the class variable.so name will be given to class variable name
		this.age=age;
		System.out.println(name);
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword Obj=new ConstructorWithThisKeyword("Pankaj",30);
		System.out.println(Obj.name);// if we comment the this block then it will null value because class variablesa are not initialized
		System.out.println(Obj.age);
	}

}
