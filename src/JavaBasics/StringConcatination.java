package JavaBasics;

public class StringConcatination {

	public static void main(String[] args) {

		int a = 100, b = 200;

		double d = 20.99;
		double d1 = 12.33;

		String s = "Hello-Again";
		int length = s.length();
		System.out.println(length);// 5

		String[] result = s.split("-");//To print we need for loop 
		for (int i = 0; i < result.length; i++) {
			System.out.println("results are " + i + " " + result[i]);

		}
		System.out.println(s.startsWith("Hello"));// true
		System.out.println(s.endsWith("Again"));// true

		System.out.println(s.charAt(4));// o
		System.out.println(s.substring(2, 4));// ll
		System.out.println(s.charAt(4));// o
		System.out.println(s.compareTo("Hello"));// 0--if Zero is appearing then
													// string are equal.
		System.out.println(s.contains("z"));// false
		System.out.println(s.equals("pank"));// false
		System.out.println(s.valueOf(s));// hello
		System.out.println(s.toString());// hello
		System.out.println(s.replace("Hello", "C++"));// c++
		System.out.println(s);// hello
		System.out.println(s.indexOf('j'));// -1 negative value if the char is
											// not available
		System.out.println("***************");
		System.out.println(s.indexOf("H", 1));
		System.out.println(s.lastIndexOf('t'));// -1
		System.out.println(s.substring(0, 3));// hel
		System.out.println(s.substring(0, 4));// hell
		String s1 = "Pankaj";
		
		
		System.out.println(s.toUpperCase().charAt(2));
		//System.out.println(s);
		System.out.println(a + b);// 300
		System.out.println(s + s1);// HelloPankaj
		System.out.println(a + b + s + s1);// 300HelloPankaj
		System.out.println(s + s1 + a + b);// HelloPankaj100200
		System.out.println(s + s1 + (a + b));// HelloPankaj300
		System.out.println(a + b + s + s1 + a + b);// 300HelloPankaj100200
		System.out.println(s + s1 + d + d1);// HelloPankaj20.9912.33
		System.out.println("Hello Pankaj");
		System.out.println("The value of a :" + a);
		System.out.println("The addition of a and b :" + (a + b));
		System.out.println("Hello Pankaj");
		System.out.println("How are you?");// Println is used to print on the
											// console /output with the new line
		System.out.print("Hello");
		System.out.print("Selenium");// Print is just used to print on the
										// console
	}

}
