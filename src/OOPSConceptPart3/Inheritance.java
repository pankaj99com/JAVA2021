package OOPSConceptPart3;

import javax.jws.soap.SOAPBinding;

class Parent{
	int parentx=10;
	int parenty=20;
//	public int getparentx(){
//		return parentx;
//	}
//	
//	public void setparentx(int parentx){
//		parentx=parentx;
//		
//	}
//	
//	public int getparenty(){
//		return parenty;
//	}
//	
//	public void setparenty(int parenty){
//		parenty=parenty;
//		
//	}
//	
	public Parent(int parentx,int parenty){
		
		this.parentx=parentx;
		this.parenty=parenty;
		System.out.println("value of x from parentconstructor: "+parentx );
		System.out.println("value of y from  parentconstructor: "+parenty );
	}

	public Parent() {
		System.out.println("Parent default constructor");
	}
}


class child extends Parent{
	public child(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public int childx;
	
	
	
}
public class Inheritance {

	public static void main(String[] args) {
		
		child obj=new child(10,70);
		obj.childx=10;
		obj.parentx=40;
		
		Parent obj1=new Parent(10,20);
		obj1.parentx=10;
		
		//child obj3=new Parent();
		
//		Parent obj2=new child();
//		obj2.parentx=90;
		
		
	}

}
