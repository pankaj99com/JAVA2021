package Encapsulation;

public class TestReadOnlyDesign {
	//private data member  
		private String college;  
		//getter method for college  
		public void setCollege(String college){  
		this.college=college;  
		}  
	
	public static void main(String[] args) {
		TestReadOnlyDesign s=new TestReadOnlyDesign();
		System.out.println(s.getCollege());//Compile Time Error, because there is no such method  
		System.out.println(s.college);//Compile Time Error, because the college data member is private.   
		//So, it can't be accessed from outside the class  
	}

}  

	