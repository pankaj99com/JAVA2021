package OOPSConceptPart3;

public class DemoOops2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2("Pankaj", 34);

		System.out.println(p1.name + "  " + p1.age);

		p1.eat();
		p1.walk();
		Person2 p2 = new Person2("Sandeep", 28);

		System.out.println(p2.name + " " + p2.age);

		p2.eat();
		p2.walk(1000);

		Tester t1 = new Tester("Senthil", 35);
		t1.doWork();
		t1.eat();
		t1.walk();// Since same method is present in child class in this case at
					// run time it will decide which method to call so it is
					// called as run time polymorphism and at that time child
					// own method will be called.

		
		Tester t3=new Tester();
		t3.walk();
		Person2 p3=new Tester("Vishwa",27);
		p3.doWork();
		p3.eat();
		p3.walk();
		p3.walk(15000);
		
		Person2 p4=new Person2("Neeraj",35);
		p4.doWork();
		p4.eat();
		p4.walk();
		p4.walk(2000);
		System.out.println("Total number of object created :" + Person2.count);
		//Tester t2=(Tester) new Person2("PankajKumar",34);
		//t2.doWork();
		
		

	}

}

class Tester extends Person2 {
	
	public Tester(String name, int age) {
		
		super(name, age);
		
	}

	public Tester() {

		int a=10;
		System.out.println(a);
		System.out.println("Tester:No Arguement constructor");
	}

	void walk() {

		System.out.println("Tester method: Tester< " + name + " > is walking");
	}
}

class Person2 {
	String name;
	int age;
	static int count;

	public Person2() {
		count++;
		System.out.println("Creating an object");
	}

	public Person2(String name, int age) {

		this();// if we want to call another constructer then we can use this()
				// keyword
		this.name = name;// this is also used for avoid instance variable
							// hiding--if i want to assign class varaiable
							// thenwe can use this
		this.age = age;
		// name=name;
		// age=age;
	}

	void walk() {
		System.out.println("Person <" + name + "> is walking");
	}

	void eat() {
		System.out.println("Person <" + name + ">is eating");
	}

	void walk(int Steps) {
		System.out.println("Person <" + name + "> is walking " + Steps + " Steps per day");
	}

	void doWork() {
		System.out.println("Person <" + name + "> is working");
	}

}
