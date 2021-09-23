package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		System.out.println("************************************");
		/* The above statement will print top 5 integer number but this is very bad practice to
         print like this,so to above repeatative code we will use looping concepts.*/

		//1.while loop
		//Print 1 t0 10
		int i=1;//mandatory condition for while loop to start
	   //This is the starting point
		//initialization
		
		

		while(i<=10){//condition
			System.out.println(i);
			i=i+1;//if we comment this code then it will go into infinite loop//increment /decrement
		}

		System.out.println("************************************");
		//print 10 to 1
		int j=10;
		while(j>=1){
			System.out.println(j);
			j=j-1;
		}

		System.out.println("************************************");
		//2.for loop
		//Print 1 t0 10
		for(int k=1;k<=10;k++){
			System.out.println(k);
		}

		System.out.println("************************************");
		//print 10 to 1
		for(int l=10;l>0;l--){
			System.out.println(l);
		}
	}

}
