package OOPSConceptPart1;

public class FunctionInJava {
	
	// main method--starting point of the execution
	int n=10;
	
	public int division(int x,int y){
		System.out.println("Division method");
		int d=x/y;
		return d;


	}
	public static void main(String[] args) {
		
		FunctionInJava f1=new FunctionInJava();
		
		//one object will be created,f1 is the object reference variable,referring to this object.
		//After creating the object,the copy of all non static methods will be given to this object.
		
		f1.test();
		int storing=f1.n;
		int d=f1.division(30, 25);
		System.out.println(d);
		int i=f1.pqr();
		System.out.println(i);
		int d3=f1.division(40, 25);
		System.out.println(d3);
		String s=f1.qa();
		System.out.println(s);
		int d2=f1.division(55, 25);
		System.out.println(d2);
		int d1=f1.division(20, 2);
		System.out.println(d1);
		
		
		
	}
	//non static menthods

	//1.type1-no input no output
	public void test(){
		System.out.println("test method");
	}
	
	//2.type 2-no input some output

	public  int pqr(){
		System.out.println("PQR method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}

	//3. type 3-no input some output

	public String qa(){
		System.out.println("QA method");
		String s="selenium";
		
		System.out.println(s);
		return s;
	}

	//4.Type 4-Input parameters/Arguements

	
}
