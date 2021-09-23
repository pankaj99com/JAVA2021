package JavaBasics;

public class IfElseConcepts {

	public static void main(String[] args) {
		int a=10;
		int b=10;

		if(b>a){
			System.out.println("b is greater then a");
		}
		else{

			System.out.println("a is greater then b");
		}


		if(a==b){

			System.out.println("a and  b are equal");

		}else{

			System.out.println("a and b are not equal");
		}

		//Highest of 3 numbers

		int n1=10;
		int n2=40;
		int n3=30;
		// we will nested if

		if(n1>n2 && n1>n3){//false and true=false
			
			System.out.println("n1 is the greatest");
			
		}else if(n2>n1 && n2>n3){

			System.out.println("n2 is the greatest");
			
		}else{
			
			System.out.println("n3 is the greatest");
		}
	}

}
