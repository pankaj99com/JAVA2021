package mapPrograms;

public class Student {
	
	
	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	private int ID;
	private String name;
	private int age;
	
	
	
	public Student(int ID,String name,int age) {
		this.ID=ID;
		this.name=name;
		this.age=age;
	}

}
