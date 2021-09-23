package OOPSConceptPart3;
 class MyEmployee{//Only one class in java program can be public
	private int id;//if variables are defined as private and it cannot be accessible directly
	 private String name;//In order to access we have o concept of getters and setters and withh that we can achieve data hinding]
	
	 
	 public String getname(){
		return name;
		 
	 }
	 
	 public void setname(String n){
		name=n;
	 }
	 
	 
	 public  int getid(){
		return id;
		 
	 }
	 public void setid(int i){
		id=i;
	 }
}
public class AccessModifier {

	public static void main(String[] args) {
		MyEmployee pankaj=new MyEmployee();
//		pankaj.id=9;
//		pankaj.name="pankaj kumar";//Throw error because we are tryig to access private variables
       pankaj.setid(9);
       
       System.out.println(pankaj.getid());
        pankaj.setname("Pankaj kumar");
        System.out.println(pankaj.getname());
		

	}

}
