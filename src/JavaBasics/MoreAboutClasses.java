package JavaBasics;

public class MoreAboutClasses {
	static String color="red";
	int wheels;
	int model;
	String Brand;
	public MoreAboutClasses(int wheels,int model) {
		this.wheels=wheels;
		this.model=model;
	}
	
	public MoreAboutClasses(String Brand) {
		this.Brand=Brand;
	}
	public void Purchase() {
		System.out.println("Car puchased");
	}
	public static void main(String [] args) {
		
		//static String color="red"; Wrong place

		MoreAboutClasses obj=new MoreAboutClasses(4,2021);
		System.out.println(obj);
		System.out.println(obj.equals(obj));
		System.out.println(obj.wheels);
		System.out.println(obj.model);
		MoreAboutClasses obj1=new MoreAboutClasses("BMW");
		System.out.println(obj1.Brand);
		obj.Purchase();
		obj1.Purchase();
		

}
}
