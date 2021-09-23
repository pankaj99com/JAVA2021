package OOPSConceptPart3;

public class DemoOops1 {

	public static void main(String[] args) {
		Person1 p1=new Person1("Pankaj",34);
		
		
		
		System.out.println(p1.name+"  "+p1.age);
		
		p1.eat();
		p1.walk();
		Person1 p2=new Person1("Sandeep",28);
		
		
		System.out.println(p2.name+ " "+p2.age);
		
		p2.eat();
		p2.walk(1000);
		
		System.out.println("Total number of object created :"+Person1.count);

	}

}
class Person1{
	String name;
	int age;
	static int count;
	
	
   public Person1() {
	   count++;
		System.out.println("Creating an object");
	}
    public Person1(String name, int age) {
    	
    	this();//if we want to call another constructer then we can use this() keyword
    	this.name=name;//this is also used for avoid instance variable hiding--if i want to assign class varaiable thenwe can use this
    	this.age=age;
//		name=name;
//		age=age;
	}

	void walk(){
		System.out.println("Person " + name + " is walking");
	}
	
	void eat(){
		System.out.println("Person " + name + " is eating");
	}
	
	void walk(int Steps){
		System.out.println("Person " + name + " is walking "+Steps+ " Steps per day");
	}
	
}
