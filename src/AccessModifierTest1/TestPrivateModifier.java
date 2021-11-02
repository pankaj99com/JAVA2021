package AccessModifierTest1;

public class TestPrivateModifier {
	
	private int age;
	TestPrivateModifier(int age){
		this.age=age;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		
		
		TestPrivateModifier obj= new TestPrivateModifier(45);
		//obj.age=90;
		System.out.println(obj.age);
		obj.setAge(90);
	System.out.println(obj.getAge());
	obj.setAge(80);
	System.out.println(obj.age);
	}

	
}
