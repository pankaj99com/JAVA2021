package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {

		int i=1;
		int j=i++;//post increment

		System.out.println(i);
		System.out.println(j);

		int a=2;
		int b=++a;//pre increment

		System.out.println(a);
		System.out.println(b);

		int m=2;
		int n=m--;//post decrement
		System.out.println(m);
		System.out.println(n);

		int k=2;
		int l=--k;//pre decrement
		System.out.println(k);
		System.out.println(l);
	}

}
