package Practice;

public class ConstructorDemo {

	public static void main(String[] args) {
		// A a=new A();
		// a.age=30;
		// a.name="Pankaj";
		// a.add(10, 20);
		// a.add(10, 20, 30);
		// a.add("Sandeep", 28, 20000.0);

		A a1 = new A("Vishwa", 30);
		// a1.age=45;
		// a1.name="Vishwa";
		// a1.add(20, 70);
		// a1.add(10, 80,2000);
		// a1.add("Vishwa", 30, 30000.0);
		// a1.getAge();
		System.out.println(a1.getName());
		System.out.println(a1.getAge());
		
		A a2=new A("Pankaj",10,2334);
		
		System.out.println(a2.getName());
		System.out.println(a2.getAge());
		a2.setEmpid(3444);
		System.out.println(a2.getEmpid());
	}

}

class A {

	private int age;
	private String name;
	private int empid;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	A() {
		System.out.println("I am going to initialize the object ");
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	A(String name, int age) {
		this();

		this.name = name;
		this.age = age;
		System.out.println("Parameterized constructor:");

	}
	A(String name, int age,int empid) {
		this(name,age);
		System.out.println("calling another constructor");

	    this.empid=empid;
		System.out.println("Parameterized constructor:");

	}

	public int add(int a, int b) {
		int sum = a + b;

		System.out.println(sum);
		return sum;

	}

	public int add(int a, int b, int c) {
		int sum = a + b + c;

		System.out.println(sum);
		return sum;

	}

	// public void add(String name ,int age,double income) {
	// this.name=name;
	// this.age=age;
	// income=income;
	//
	// System.out.println("Name : " + name + " age : " + age + " income: " +
	// income);
	//
	//
	// }
}