package ConstructorDemo;

public class Student1 {

	int age;
	String name;
	String colour;

	public Student1(int age, String name) {
		this.age = age;
		this.name = name;

		System.out.println("name is:" + name);
		System.out.println("Äge is :" + age);
		
	}

	public Student1(int age, String name,String colour) {
		
		this.colour=colour;
		
		System.out.println("name is:" + name);
		System.out.println("Äge is :" + age);
		System.out.println("colour is: "+colour);
	}

	
	
	public static void main(String[] args) {
//		Student1 obj1 = new Student1(10, "Pankaj");
		//System.out.println(obj1.age);
		Student1 obj2=new Student1(10,"sANdeep");
		String str=new String("pankaj");//2 object
		String str3=str.concat("Kumar");
		System.out.println(str3);
		String str1="pankaj";//1 obj
		

	}

}
