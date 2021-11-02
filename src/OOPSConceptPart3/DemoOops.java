package OOPSConceptPart3;

public class DemoOops {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Pankaj";
		p1.age=34;
		
		
		System.out.println(p1.name+"  "+p1.age);
		
		
		p1.eat();
	
		p1.walk();
		Person p2=new Person();
		p2.name="Sandeep";
		p2.age=28;
		
		System.out.println(p2.name+ " "+p2.age);
		
		p2.eat();
		p2.walk(1000);

	}

}
class Person{
	String name;
	int age;
	
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
