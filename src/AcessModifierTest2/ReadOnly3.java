package AcessModifierTest2;

public class  ReadOnly3{
	 
		//private data member  
		private int age; 
		public ReadOnly3(int age) {
			this.age=age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		//getter method for college  
		public int getAge(){  
		return age;  
		}  
		
//	public static void main(String[] args) {
//		ReadOnly obj=new ReadOnly();
//		System.out.println(obj.getCollege());
//		obj.college="AIT";
//		System.out.println(obj.getCollege());
//
//	}

}
