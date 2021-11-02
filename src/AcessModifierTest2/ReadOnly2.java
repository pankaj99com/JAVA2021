package AcessModifierTest2;

public class ReadOnly2 {
	 
		//private data member  
		private String college;  
		public void setCollege(String college) {
			this.college = college;
		}
		//getter method for college  
		public String getCollege(){  
		return college;  
		}  
		
//	public static void main(String[] args) {
//		ReadOnly obj=new ReadOnly();
//		System.out.println(obj.getCollege());
//		obj.college="AIT";
//		System.out.println(obj.getCollege());
//
//	}

}
